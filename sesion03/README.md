## Rendimiento y recursión

#### ¿Qué es la Recursión?

La recursión consiste en que una función se va a llamar a sí misma. No va a llamar a otra, sino que va a hacerlo a sí 
misma.

Cuando hablamos de _*recursividad*_ es crítico que le metamos la **sentencia de control o punto de salida**. Esto 
es lo 
que va a parar la recursividad cuando ocurra algo, porque sino **la recursividad es infinita**.

#### Existen dos tipos de recursividad

* Recursividad de cola (_Tail Recursion_): lo último que se ejecuta es la llamada de la función hacia sí misma.

* Recursividad por cabeza(_Head Recursion_): lo primero que hacemos es invocar a la función recursiva.

#### Ventajas al utilizar recursividad
1. Reduce la _complejidad de tiempo_: Es una forma de medir cuánto tiempo tarda en ejecutarse algo. Para que esto 
   ocurra debemos utilizar una técnica llamada _[Memoization](https://platzi.com/clases/2118-react-hooks/33472-que-es-memoization-tecnicas-de-optimizacion-en-pro/#:~:text=Memoization%20es%20una%20t%C3%A9cnica%20%C3%BAtil,%E2%80%9Cmucho%E2%80%9D%20espacio%20de%20almacenamiento.)_
que consiste en evitar cálculos innecesarios en nuestro código.
2. Añade cierta claridad y simplicidad al código cuando tenemos que escribir y depurar.
3. Se destaca aún más a la hora de hacer recorrido de árboles (estructura de datos que tienen forma de árbol).

#### Desventajas al utilizar recursividad
1. Consumo de memoria: Porque cada vez que se llama a sí misma, tiene que cear una copia de todas las variables que 
   está utilizando para no modificarlas.
2. Puede ser muy lenta: si no se implementa correctamente la recursividad (por ejemplo utilizando la técnica de 
   Memoization) surge el problema de que se aloja un nuevo frame en cada llamada.
