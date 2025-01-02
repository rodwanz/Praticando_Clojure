(ns praticando-clojure.exer3)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 0))
(println (get precos 2))
(println "valor padrão nulo" (get precos 22))
(println "valor padrão zero" (get precos 22 0))
(println "valor padrão zero, mas exite" (get precos 2 0))

;(println "vamos fazer um conj" (conj precos 5000))
(println "atualiza/ altera um valor dentro do vetor fazendo um incremento"
         (update precos 0 inc))
(println "atualiza/ altera um valor dentro do vetor fazendo um decremento"
         (update precos 1 dec))

(defn soma-1 [valor]
  (println "estou somando 1 em" valor)
  (+ valor 1))

;(println (update precos 0 soma-1))

(defn soma-3 [valor]
  (println "estou somando 3 em" valor)
  (+ valor 3))

;(println (update precos 0 soma-3))


(defn aplica-desconto? [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "map - valor descontado mapeando cada elemento de precos"
         (map valor-descontado precos))
(println "o vetor" precos)
(println "fiter" (filter aplica-desconto? precos))
(println "este map apos o fiter so para efeito de estudo, pois aqui não precisa"
         (map valor-descontado (filter aplica-desconto? precos)))

(println "o vetor" precos)
(println (reduce + precos))

(defn minha-soma [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))
(println (reduce minha-soma precos))
(println (reduce minha-soma 0 precos))





