## Refactoring

### Clean code (código limpio)

_Código limpio_ es aquel que cualquier desarrollador pueda leer y cambiar fácilmente.

El _código limpio_ tiene tres propiedades:
1. **Es focalizado:** Cuando escribimos un componente, lo hacemos para solventar un problema concreto. Y este 
   componente no debe hacer nada que no sea para lo que fué escrito.
2. **Simple:** El diseño y la implementación deben ser lo más simple posible.
3. **Comprobable o Testeable con Pruebas Unitarias:** Debe ser fácilmente verificable y estas verificaciones deben 
   ser (preferiblemente) de forma automática. En Java se utiliza mucho una herramienta llamada _**JUnit**_.

Una de las partes del _Código Limpio_ es la _Refactorización_.

#### Refactorización:

Es un proceso de cambiar software de forma que mejoramos la estructura de nuestro código (lo hacemos más bonito, más 
elegante, más simple o más claro) sin alterar el comportamiento. Es decir, cuando _refactorizamos_ estamos mejorando 
el diseño de nuestro código después de ser escrito.

NOTA IMPORTANTE: No está permitido añadir funcionalidades cuando se refactoriza.

**Técnicas más habituales para refactorizar:**

- **Técnica Red-Green:**
También conocida como _Test Drive Development_. Esta técnica consiste en que primero escribo el test, luego escribo 
  el código y por último, luego de que el código escrito ha pasado el test, ahí entra viene parte de refactorizar (si 
  fuera necesario). Es decir, consta de 3 estados:
  1. Red
  2. Green
  3. Refactor

- **Técnica de la Abstracción:**
Consiste en crear una capa de abstracción para reducir código duplicado. Por ejemplo, utilizando patrones como el 
  Facade, Strategy, etc.

- **Técnica de extracción de valor de retorno:**
Consiste en extraer el valor de retorno de una estructura de control if-else, en donde se evita colocar el else en 
  dicha estructura y simplemente se retorna el valor por defecto en caso de no ser verdadera la condición.

- **Técnica Inlining:**
Consiste en mover todo el cuerpo de la función a la función padre.

- **Técnica Extract Variables:**
La _técnica de extracción de variables_ consiste en "EXTRAER VARIABLES" de una estructura de control "if".
