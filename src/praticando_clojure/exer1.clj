(ns praticando-clojure.exer1)

(defn imprime-mensagem []
  (println "Bem vindo ao estoque!"))

;(println (imprime-mensagem))

(defn imprime-mensagem []
  (println "Mostrando valor bruto!"))

(defn aplica-descoto [valor-bruto]
  (* valor-bruto 0.9))

;(println (imprime-mensagem))
;(println (aplica-descoto 100))

(defn valor-descontado
  "Retorna o valor descontado"
  [valor-bruto]
  (* valor-bruto 0.9))

;(println (valor-descontado 120))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (def desconto 0.10)
  (* valor-bruto (- 1 desconto)))
;(println (valor-descontado 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10])
  (* valor-bruto (- 1 desconto)))
;(println (valor-descontado 150))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculando desconto" desconto)
    (* valor-bruto (- 1 desconto))))
;(println (valor-descontado 150))


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto" desconto)
    (- valor-bruto  desconto)))
;(println (valor-descontado 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (> valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto" desconto)
      (- valor-bruto  desconto))))
(println (valor-descontado 100))
