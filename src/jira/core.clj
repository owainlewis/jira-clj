(ns jira.core
  (:require
   [cheshire.core :as json]
   [clj-http.client :as http]))

;; API for Atlassian JIRA
;; For full API docs see https://developer.atlassian.com/server/jira/platform/rest-apis/
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Configuration
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn jira-env-config []
  (let [endpoint (System/getenv "JIRA_ENDPOINT")
        username (System/getenv "JIRA_USERNAME")
        password (System/getenv "JIRA_PASSWORD")]
    {:endpoint endpoint :auth [username password]}))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Client HTTP requests
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn build-request-url
  ([jira-url name version resource]
   (str jira-url "/rest/" name "/" version "/" resource)))

(defn jira-request  "Makes a request to the JIRA API based on configuration   Example: (jira-request config :get \"api\" \"myself\")"
  [config method api-name resource & [opts]]
  (let [{endpoint :endpoint
         auth :auth
         version :version, :or {version "latest"}} config]
    (let [url (build-request-url endpoint api-name version resource)
          response (http/request
                    (merge {:method method
                            :url url
                            :as :json
                            :basic-auth auth} opts))]
      (-> response :body))))
