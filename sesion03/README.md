## Rendimiento y recursión

#### ¿Qué es la Recursión?

La recursión consiste en que una función se va a llamar a sí misma. No va a llamar a otra sino que va a hacerlo a sí 
misma.

Cuando hablamos de _*recursividad*_ es crítico que le metamos la **sentencia de control o punto de salida**. Esto 
es lo 
que va a parar la recursividad cuando ocurra algo, porque sino **la recursividad es infinita**.

#### Esxisten dos tipos de recursividad

* Recursividad de cola (_Tail Recursion_): lo último que se ejecuta es la llamada de la función hacia sí misma.
* Recursividad por cabeza(_Head Recursion_): lo primero que hacemos es invocar a la función recursiva.