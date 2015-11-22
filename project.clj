(defproject slice-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.7"]]
  :ring  {:handler slice-api.core/handler
          :init slice-api.core/on-init
          :port 3001
          :destroy slice-api.core/on-destroy}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.2.0"]
                 [org.clojure/data.json "0.2.3"]
                 [compojure "1.1.6"]])
