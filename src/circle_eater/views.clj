(ns circle-eater.views
  (:use compojure.core)
  (:require [compojure.route :as route]))

; should use hiccup/enlive too

(def home
  (GET "/" [] "<!DOCTYPE html><body><h1>Hello world!</h1></body></html>"))

(def random-json-endpoint
  (GET "/api/:id" [id] (str "<h1>" id "</h1>")))

(def public
  (route/resources "/"))

(def not-found
  (route/not-found "<h1>Page not found.</h1>"))
