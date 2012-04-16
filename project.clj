(defproject circle-eater "0.0.1"
  :description "A project which generate, consumes, and logs random json data"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cheshire "4.0.0"]
                 [compojure "1.0.1"]
                 [clj-http "0.3.6"]
                 [amon-log "0.1.0"]]
  :plugins [[lein-ring "0.6.3"]]
  :ring {:handler circle-eater.core/app})
