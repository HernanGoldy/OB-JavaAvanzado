## Patrones de Comportamientos

Los _patrones de comportamientos_ se ocupan de la comunicación entre diferentes objetos. Es decir, se ocupan de que 
unos objetos funcionen con otros.

Los patrones de comportamientos más utilizados son:
* Iterator
* Observer

### **_Iterator:**

Un _**patrón iterator**_ implementa una serie de métodos en nuestra clase de forma que podamos recorrer datos sin 
saber como están almacenados internamente en esa clase. Sin importar si están en un _Arraylist_, un _hashMap_, una 
LinkedList_, ect.

Los métodos más comunes en las interfaces de iteración (y que se implementan para el patrón Iterator), suelen ser:
- next(); - Devuelve el siguiente elemento en una lista, un hashMap, etc. O sea, recorremos los elementos 1 por 1.
- reset(); - Va a reiniciar el contador a 0 (por ej. de usuarios). Pone el iterador al principio de la lista.
- hasMore(); - No indica si hay o no más elementos en una lista.

NOTA: Si iteramos sobre _Usuario_, debemos llamar a la clase _Usuarios_ porque vamos a devolver un objeto tipo 
_Usuarios_ sobre el cual estamos iterando.

El patrón Iterator es muy útil para cambiar las conexiones a las bases de datos, como por ejemplo de MySQL a PostgreSQL.

### **_Observer:**

Un _**patrón observer**_ lo que haces es: Uno habla y muchos escuchan. Es un patrón _one to many_. Cuando se produce 
un evento, los suscriptores de ese evento reaccionan ante lo que ocurre. Este patrón también es llamado Public 
Subscriber: uno _publica_ y los otros se suscriben a esas publicaciones para reaccionar ante un evento. Como es el 
ejemplo de una Emisora.
1. Se comienza con una _interfase_ la cual van a tener que implementar todos los que reciban el mensaje.
2. Se ejecuta el método de los receptores en el Patrón Observer. Para ello se crea _una emisora_.
3. Implementamos los receptores.

NOTA: El ejemplo típico del mundo real es cuando tenemos un sistema de registro de usuarios. Cuando el usuario se 
registra, mandamos una señal al sistema de bases de datos o al sistema de registros para tener la notificación de 
que algo ha pasado.

### **_Mediator:**

El _**patrón mediator**_ actúa de mediador (de comunicador) entre dos objetos. ¡CORRE VE Y DILE!

Este patrón en muy útil cuando tenemos a muchas clases que se tienen que comunicar entre ellas. Y es muy útil en 
interfaces de usuarios.

Por ejemplo: si tenemos que comunicar a 5 clases entre ellas, utilizaríamos a una _clase mediadora_ donde si la 
clase A quiere comunicarse con la clase B, tiene que darle el mensaje a la clase mediadora y ésta última le pasa el 
mensaje a la clase B. Luego la clase B responde el mensaje a la clase A pero le da el mensaje a la clase mediadora y 
la clase mediadora es quien le da la respuesta a la clase A.

1. "A" habla con el "mediador" para enviarle un mensaje a "B"
2. El "mediador" toma el mensaje de "A" y se la entrega a "B"
3. "B" le responde a "A pero esa respuesta se la entrega al "mediador" y no directamente a "A"
4. El "mediador" toma la respuesta de "B" y se la entrega a "A"

NOTA IMPORTANTE: Un _Mediador_ recibe un mensaje de un objeto y se lo pasa a otro objeto pero NO SE LO PUEDE PASAR A 
SÍ MISMO. HAY QUE EVITAR LA DUPLICIDAD. Es decir, si tengo una instancia de un objeto en concreto, no puedo duplicar 
ésa instancia.

Forma correcta:
> if (!colegas.contains(colega)) {
>     colegas.add(colega);
>    colega.setMediator(this);
> }

Podemos utilizar _clases abstractas_: En estas clases, parte del código está dentro de la clase y otra parte del 
código tenemos que _implementarla_ como si fuera una _interfase_.

#### Terminología habitual (y oficial) del Patrón Mediator
- MediadorConcreto (clase): El término _Concreto_ hace referencia a un _Mediador único_ y debe _extender_ de la 
  _clase abstracta_ Mediator.
- ColegaConcreto1 (clase): Va a _extender_ de la clase abstracta y hacer una instancia en concreto.

### **_State:**

El _**patrón state**_ consiste en implementar una clase abstracta con una serie de funciones. Cada función va a 
cumplir un comentido, y una función va a permitir cambiar el _Estado_ a la siguiente función y así sucesivamente, 
como si fuera una cadena de eventos: si estoy en el estado "A", solamente me puedo ir al estado "B". Si estoy en 
estado "B", solamente me puedo ir al estado "C". Es una sucesión de eventos. ¡HASTA QUE NO HAGAS ESTO, NO PUEDES 
HACER LO OTRO!

Por ejemplo: Si hay tres estados, no pedo hacer el estado 3 sin hacer (primero) el estado 1, luego el estado 2 y por 
último el estado 3.

Este patrón se utiliza para crear flujos de trabajo (workflows).

1. Podemos nombrar a una clase abstracta _Estado_ para indicar en qué estado se encuentra mi programa.

### **_Strategy:**

El _**patrón strategy**_ se utiliza para crear un envoltorio sobre varias funciones de forma que un mismo código se 
pueda utilizar de formas diferentes. Es decir, si tenemos diferentes clases que implementan una misma interfase y 
creamos, podremos utilizarlas indistintamente.

1. Creamos la clase interface para implementarla en las clases comunes
2. Una ves realizadas las implementaciones, en el main debemos hacer los _envoltorios_ (función que según el 
   parámetro que le pase, va a invocar a una clase o a otra) correspondientes
