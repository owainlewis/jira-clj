(ns jira.core
  (:require [clojure.java.io :as io]
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
    {:endpoint endpoint :auth [username password]})

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; OAS Parsing (Dynamic Client Generation)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn render [resource]
  (let [{path :path method :method id :id description :description} resource]
    (str "(defn " id "\n" description "\n[config & [opts]]\n(jira-request config method))\n")))

(defn build-structure [path m]
  (for [[k v] m :when (= k :get)]
    {:path path
     :method k
     :id (get v :operationId)}))

(defn parse-oas-resource [resource]
  (let [[x & xs] resource path (name x)]
    (mapcat
     (fn [m]
       (for [[k v] m :when (= k :get)]
         {:path path
          :method k
          :description (get v :description)
          :id (get v :operationId)}))
     xs)))

(defn parse-oas []
  (if-let [resources (-> (slurp "resources/swagger.json")
                         (json/parse-string true))]
    (into []
          (mapcat parse-oas-resource
                  (:paths resources)))))

(defn generate []
  (let [result (parse-oas)]
    (for [v result]
      (spit "output.clj" (render v) :append true))))

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
