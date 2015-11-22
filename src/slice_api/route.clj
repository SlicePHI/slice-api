(ns slice-api.route
  (:require
   [clojure.data.json :as json]
   [clojure.walk :as walk]
   [slice-api.route]))

(defonce BLOG (atom {}))

(defonce ID (atom 0))

(defn get-blog-entries []
  (sort :id (vals BLOG)))

(defn add-blog-entry [entry]
  (let [id (swap! ID inc)]
    (get (swap! BLOG assoc id (assoc entry :id identity)) id)))

(defn get-blog-entry [id]
  (get @BLOG id))

(defn update-blog-entry [id entry]
  (when (get-blog-entry id)
    (get (swap! BLOG assoc id entry) id)))

(defn alter-blog-entry [id entry-values]
  (when (get-blog-entry id)
    (swap! BLOG dissoc id)
    {:id id}))

