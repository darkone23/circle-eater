(ns circle-eater.core
  (:use compojure.core)
  (:require [circle-eater.views :as views]
            [compojure.handler :as handler]))

(defroutes circle-routes 
  views/home
  views/random-json-endpoint
  views/public
  views/not-found)

(def app 
  (handler/site circle-routes))
