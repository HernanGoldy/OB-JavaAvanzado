## Patrones Creacionales

Un _**patrón creacional**_ sirve para crear objetos e instancias de una forma más simple. Es decir, estos patrones nos ayudan o simplifican el proceso de creación de instancias y de objetos.

### Los patrones creacionales son 4:

### **_Singleton:**

Sirve compartir una _instancia_ para evitar múltiples instancias de una misma clase que invoquen a métodos y tengan comportamientos diferentes.
  * Solo puede haber una única instancia de una clase.
  * Pretende evitar que se creen nuevas instancias.
  * Cuando se crea una instancia no se utiliza _new_ sino Nombre.getInstance()
  * Puede compartir conexiones a una base de datos
  * Compartir acceso a un mismo fichero
  * Evitar la instanciación de una aplicación múltiples veces
  * O en cualquier parte donde se necesite una instancia compartida

### ¿Cuál es la forma de implementar un Singleton?
1. Hacer privado un constructor
2. Implementar un método que actúe como constructor (pseudo constructor = getInstance() que es quién crea la instancia y verifica que no esté creada previamente la instancia)

### **_Factory:**

Sirve para crear una jerarquía de clases y utilizar una u otra de forma transparente. 