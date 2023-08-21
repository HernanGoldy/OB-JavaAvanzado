## Servicios Rest

Un servicio rest es una aplicación web que cumple una serie de patrones determinados.

### Verbos HTTP

Son tipos de peticiones que enviamos a un servidor utilizando el protocolo HTTP:

Patrón CRUD (Create Replace Update Delete)
* GET -> Obtener
* POST -> Crear
* PUT -> Actualizar
* DELETE -> Eliminar

>* El _controlador_ se comunica con el _modelo_ a través del _servicio_. Es decir que el _controlador_ utiliza al 
   > _servicio_ para comunicarse con el _modelo_.
>* El _controlador_ no sabe nada del _modelo_ porque solo se comunica con el _servicio_.
>* Es el _servicio_ es quién se comunica directamente con el _modelo_.

