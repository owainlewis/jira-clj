(defproject jira "0.1.0-SNAPSHOT"
  :description "A Clojure API for Atlassian JIRA"
  :url "https://github.com/owainlewis/jira"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-cljfmt "0.8.0"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cheshire "5.10.0"]
                 [clj-http "3.12.3"]]
  :repl-options {:init-ns jira.core})
