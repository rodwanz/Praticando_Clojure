(ns praticando-clojure.exer2)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (> valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))
;(println (valor-descontado 100))
;(println (valor-descontado 1000))

(defn deve-aplicar-desconto? [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))
;(println (deve-aplicar-desconto? 1000))
;(println (deve-aplicar-desconto? 100))

(defn aplica-desconto? [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))
;(println (aplica-desconto? 1000))
;(println (aplica-desconto? 100))



(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))
;(println (valor-descontado 100))
;(println (valor-descontado 1000))

(defn aplica-desconto? [valor-bruto]
  "Usando o when"
  (when (> valor-bruto 100)
    true))

(defn aplica-desconto? [valor-bruto]
  (println "Versão direta")
  (> valor-bruto 100))


(defn mais-caro-que-100? [valor-bruto]
  (println "Deixando claro a invocação da função mais-caro-que-100?")
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))
(println "FUNÇÃO COMO PARAMETRO!")
(println (valor-descontado mais-caro-que-100? 100))
(println (valor-descontado mais-caro-que-100? 1000))


