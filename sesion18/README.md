## Organización de Clases

### ✔ Las clases deben ser cortas

Las clases deben ser los más cortas posibles y por ello evitar crear clases de 600/800 líneas de código. Si las 
clases superan las 200 líneas de código hay que empezar a pensar en separar el código en _clases más concretas_.

### ✔ Las clases deben seguir el principio de Responsabilidad Única

Las clases deben tener una única funcionalidad. Es decir tienen que hacer una sola cosa. UNA CLASE, UNA RESPONSABILIDAD.

### ✔ Las clases deben estar cohesionadas (acopladas)



### Encapsulación

Las clases bien diseñadas tienen que estar totalmente encapsuladas. Es decir, debemos tener clases con _propiedades_ 
que van a ser siempre privadas y cuya única forma de acceder y modificar sus valores es a través de _instancias de 
clases_. Y a estos métodos se los conoce como _getter y setters_.

### ¿Cómo se implementa un getter y un setter?

1. Creamos una clase con un nombre que haga referencia exclusivamente al objeto en concreto.
2. A esa clase le damos propiedades inherentes de ese objeto (private String nombre, private int edad, private 
   boolean esFemenino, etc.).
3. Creamos los accesos a esas propiedades a través de los métodos _getters_ y _setters_. Estos métodos son funciones 
   de tipo _public_ para poder acceder a ellas.
4. Si es un _getter_ debe devolver el tipo de dato acorde a la propiedad a la que hace referencia, es decir String, 
   int, boolean, long, etc. y por convención su nombre debe empezar con la palabra «get», seguido del nombre de la 
   variable que devuelve (getNombre, getEdad, getEsFemenino, etc.).
5. Si es un _setter_ su tipo de dato debe ser siempre _public void_ (que no devuelve nada) y su nombre debe empezar 
   con la palabra «set», seguido del nombre de la variable que va a modificar (setNombre, setEdad, setEsFemenino, 
   etc.) y entre paréntesis le asignaremos siempre el mismo nombre de la variable.
