(ns slice-api.core
  (:require [compojure.core :as compojure]
            [slice-api.users :as blog]))

(defn handler [request]
  {:body "Hola, Mundo."})

(defn on-init []
  (println "init"))

(defn on-destroy []
  (println "destroy"))
