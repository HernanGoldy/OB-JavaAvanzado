## Patrones de Comportamientos

Los _patrones de comportamientos_ se ocupan de la comunicación entre diferentes objetos. Es decir, se ocupan de que 
unos objetos funcionen con otros.

Los patrones de comportamientos más utilizados son:
* Iterator

### **_Iterator:**

Un _**patrón iterator**_ implementa una serie de métodos en nuestra clase de forma que podamos recorrer datos sin 
saber como están almacenados internamente en esa clase. Sin importar si están en un _Arraylist_, un _hashMap_, una 
LinkedList_, ect.

Los métodos más comunes en las interfaces de iteración (y que se implementan para el patrón Iterator), suelen ser:
- next(); - Devuelve el siguiente elemento en una lista, un hashMap, etc. O sea, recorremos los elementos 1 por 1.
- reset(); - Va a reiniciar el contador a 0 (por ej. de usuarios). Pone el iterador al principio de la lista.
- hasMore(); - No indica si hay o no más elementos en una lista.

NOTA: Si vos a iterar sobre _Usuario_, llamaré a la clase _Usuarios_ porque vamos a devolver un objeto tipo 
_Usuarios_ sobre el cual estoy iterando.


### **_Adapter:**

Un _**patrón adapter**_ crea una clase que permite que clases con la misma implementación y clases con distintas
implementaciones funcionen coherentemente.

### **_Facade:**

El _**patrón facade**_ consiste en esconder toda la lógica en una única llamada. Es decir, oculta (como en una fachada)
la complejidad del código, poniendo delante lo sencillo.