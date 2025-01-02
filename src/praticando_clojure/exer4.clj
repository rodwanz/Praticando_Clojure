(ns praticando-clojure.exer4)

(def estoque {"Mochila" 10 "Camiseta" 5})
(println estoque)

(println "Contando dentro do mapa" (count estoque) "itens")
(println "Temos estas chaves: " (keys estoque))
(println "EStes são os valores: " (vals estoque))


(def estoque {:mochila 10
              :camiseta 5})
(println (assoc estoque :cadeira 3))
(println "Mostrando o estoque tal como é originalmente" estoque)
(println (update estoque :mochila inc))

(defn tira-um [valor]
  (println "Tira um valor de" valor)
  (- valor 1))
(println "Simmbolo estoque nunca é aterado" estoque)
(println (update estoque :mochila tira-um))
(println (update estoque :mochila #(- % 3)))
(println "Removendo o elemento da chave desassociando" (dissoc estoque :mochila))


