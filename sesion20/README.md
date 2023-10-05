## Arquitectura Limpia (Clean Architecture)

La _Clean Architecture_ es un concepto de Robert C. Martin (coloquialmente conocido como «Uncle Bob»), que se basa 
en la premisa de estructurar el código en capas contiguas. Es decir, en lugar de implementar todo de golpe y en una 
sola clase, separar claramente «por capas» la funcionalidad de una aplicación.
- Por ejemplo, si tenemos 4 Capas, la comunicación entre ella será la siguiente:
    - La Capa 1 se comunicará con la Capa 2 pero nunca se comunicará con las Capa 3 y 4.
    - La Capa 2 se comunicará con las Capas 1 y 3 pero nunca se comunicará con la Capa 4.
    - La Capa 3 se comunicará con las Capas 2 y 4 pero nunca se comunicará con la Capa 1.
    - La Capa 4 se comunicará con la Capa 3 pero nunca se comunicará con las Capas 1 y 2.

#### Habitualmente, cuando hablamos de _Clean Architecture_ utilizamos 4 Capas:
* Capa de Entidades
* Capa de Casos de Uso
* Capa de Controladores
* Capa de "Lo Demás"

1. Capa de entidades (la que está más arriba del todo) es la que define la lógica del negocio.
    - Comunicación entre servicios
    - Modelos de datos
    - Gestión de cachés

2. Capa de Lógica de la aplicación (Capa de Casos de Usos): Todo lo que ocurra en la aplicación tiene que estar 
   considerado como un _caso de uso_.
    - Aplicación web en la que solicitamos un listado de usuarios, pero esa app web no sabe nada de usuarios porque no 
      tiene un caso de uso de listar usuarios. Simplemente, conoce - por ejemplo - como hacer recetas de cocina.

3. Capa de Interfaces Adaptadoras, donde tenemos las funciones que implementan funciones para esos casos de usos
    - Interfaces
    - Clases Abstractas

4. Capa de Frameworks y Controladores (es la capa que está más abajo - la última capa)
    - Tienen la función de comunicarse contra una base de datos
    - Presentar la información en una interfase de usuario
    - Renderizar el HTML en una página web
    - Pedir más información a otro sitio mediante una petición que lance

NOTA: En las tres primeras capas (Entidades, Casos de uso y Adaptadores de Interfase) nunca deberíamos utilizar 
frameworks, sino solamente en la última capa.

### Visto desde otra perspectiva (por etapas)

1. Primera etapa: Entry Points (puntos de entrada a la aplicación) es la que toma la petición.
2. Segunda etapa: Core de la aplicación
    - Entidades
    - Casos de Usos
3. Tercera etapa: Proveedores de datos
    - Bases de datos
    - Sistema de ficheros
    - Dispositivos remotos

> La primera etapa toma la petición, la segunda etapa procesa la información y una vez procesada, solicita la 
> información necesaria a la tercera etapa.

### Principios SOLID

Las _aplicaciones multicapas_ nos sugieren implementar el uso de los _Principios SOLID_, llamado así porque hace 
referencia a 5 principios:
- **S - Single Responsibility Principle (SRP)**
    >**Principio de responsabilidad Única:** Dice que una clase, componente o servicio debe ser responsable de una 
  > sola cosa y no ser responsable de hacer varias cosas.
- **O - Open/Closed Principle (OCP)**
    >**Principio Abierto-Cerrado:** Las entidades del software tienen que estar abiertas para que la podamos 
  > extender pero cerradas a la hora de modificarlas.
- **L - Liskov Substitution Principle (LSP)**
    >**Principio de Substitución de Liskov:** Declara que una clase se tiene que poder sustituir por la clase padre. 
  > Este principio dice que un programa debe tener una jerarquía de clases fácil de entender y que además tenga un 
  > código reutilizable.
- **I - Interface Segregation Principle (ISP)**
    >**Principio de Segregación de Interfaces:** Dice que una clase no debe implementar o depender de una interfase 
  > que no va a utilizar o que no necesite.
- **D - Dependency Inversion Principle (DIP)**
    >**Principio de Inversión de Dependencias:** Dice que _las dependencias se tienen que «abstraer»_ y que un 
  > módulo de alto nivel no debe depender de un módulo de bajo nivel.
