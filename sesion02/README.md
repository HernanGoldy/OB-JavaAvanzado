## Programación Funcional

La programación funcional es un tipo de _programación declarativa_ y NO imperativa.
Java es un lenguaje _pseudo funcional_ porque es orientado a objetos y ha heredado cosas de los lenguajes 
funcionales como ser las _funciones puras_.
La programación funcional aporta _legibilidad y transformaciones_.

### Función pura:
Es toda aquella función que, dados unos mismos parámetros de entrada, siempre produzca el mismo resultado 
de salida.

##### Requisitos:
* No puede tener _efecto colateral_.
    - _**Efecto colateral:**_ es todo aquel cambio que se realiza cuando se invoca a una función. 

#### ¿Cuándo una función deja de ser pura?
* Cuando invoca a otra función (que podría no ser pura).
* Cuando modifica una variable global.

### Funciones de alto orden
Son funciones que reciben como parámetro otra función. Es decir, estas funciones pueden llamar a otra función y deben 
devolver una función.

Tiene que tener como argumento "un nombre" y ese nombre tiene que ser una función que ya exista.
También se le añade el concepto de "Lamda". Las lamdas no llegan a ser funciones anónimas del todo. Estas _lamdas_ 
son funciones que se definen en funciones.