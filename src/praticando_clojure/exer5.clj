(ns praticando-clojure.exer5)

(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(defn imprime-e-15 [valor]
  (println "valor" valor) 15)
(println (map imprime-e-15 pedido))


(defn imprime-e-15 [[chave valor]]
  (println chave "<e>" valor) 15)
(println (map imprime-e-15 pedido))


(defn imprime-e-15 [[chave valor]]
  valor)
(println (map imprime-e-15 pedido))


(defn preco-dos-produtos [[chave valor]]
  (* (:quantidade valor) (:preco valor)))
(println (map preco-dos-produtos pedido))
(println (reduce + (map preco-dos-produtos pedido)))

(defn total-do-pedido [pedido]
  (reduce + (map preco-dos-produtos pedido)))
(println (total-do-pedido pedido))


(defn total-do-pedido [pedido]
  (println "Maneira tradicional de encadeamento THREAD LAST")
  (->> pedido
       (map preco-dos-produtos ,,,)
       (reduce + ,,,)))
(println (total-do-pedido pedido))


(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))
(defn total-do-pedido [pedido]
  (println "Maneira tradicional de encadeamento THREAD LAST")
  (->> pedido
       vals
       (map preco-total-do-produto ,,,)
       (reduce + ,,,)))
(println (total-do-pedido pedido))


(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             :chaveiro {:quantidade 1}})

(defn gratuito? [item]
  (<= (get item :preco 0) 0))
(println "Fltrantando suvenir")
(println (filter gratuito? (vals pedido)))


(defn gratuito? [[chave item]]
  (<= (get item :preco 0) 0))
(println "Fltrantando suvenir")
(println (filter gratuito? pedido))


(defn gratuito? [item]
  (<= (get item :preco 0) 0))
(println "Fltrantando suvenir, usando função anonima")
(println (filter (fn [[chave item]]  (gratuito? item)) pedido))
(println "Fltrantando suvenir, usando lambda")
(println (filter #(gratuito? (second %)) pedido))


(defn pago? [item]
  (not (gratuito? item)))
(println (pago? {:preco 50}))
(println (pago? {:preco 0}))
(println ((comp not gratuito?) {:preco 50}))


(def pago? (comp not gratuito?))
(println (pago? {:preco 50}))
(println (pago? {:preco 0}))



