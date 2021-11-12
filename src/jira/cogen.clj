(ns jira.cogen
  (:require [clojure.java.io :as io]
            [cheshire.core :as json]
            [clojure.string :as s]))

(defn- camel->snake [x]
  (let [parts (s/split x #"(?=[A-Z])")]
    (s/join "-" (map s/lower-case parts))))

(defn namespace-stanza [resource-name]
  (str "(ns jira." resource-name "\n(:require [jira.core :refer [jira-request]]))\n"))

;; BARF! : )
(defn render
  [resource]
  (let [{path :path method :method id :id description :description} resource]
    (str "(defn " (camel->snake id)
         "\n\"" (s/replace (or description "") "\"" "'")
         "\"\n[config & [opts]]\n(jira-request config " method " \"api\" \"" path "\" opts))\n")))

(defn parse-oas-resource
  [resource]
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

(defn get-resource-paths-for [path]
  (let [oas (parse-oas)]
    (filter
     (fn [x]
       (.startsWith (:path x) path)) oas)))

(defn generate-resource
  "Generate resource (generate-resource \"issue/\" \"issues\")"
  [resource-path resource-name]
  (let [result (get-resource-paths-for resource-path)]
    (spit (str "src/jira/" resource-name ".clj") (namespace-stanza resource-name) :append true)
    (do
      (for [v result]
        (spit (str "src/jira/" resource-name ".clj") (render v) :append true)))))
