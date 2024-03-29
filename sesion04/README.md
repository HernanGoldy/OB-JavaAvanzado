## Servicios Rest

Un servicio rest es una aplicación web que cumple una serie de patrones determinados.

### Verbos HTTP

Son tipos de peticiones que enviamos a un servidor utilizando el protocolo HTTP:

Patrón CRUD (Create Replace Update Delete)
* GET -> Obtener
* POST -> Crear
* PUT -> Actualizar
* DELETE -> Eliminar

### Controlador



### Modelos

Un modelo es lo que dá forma o el que contiene la información de los datos.

Dentro del _modelo_ va el _**POJO (Plain Old Java Object)**_.

### Servicios

La función del servicio es tener una lista de bootcampers en memoria:
* Darnos las lista de todos los bootcampers si invocamos al método _getAllBootcampers_.
* Añadir un nuevo bootcamper si invocamos al método _addBootcamper_.

>1. El _controlador_ acepta la petición y se comunica con el _modelo_.
>2. El _controlador_ se comunica con el _modelo_ a través del _servicio_. Es decir que el _controlador_ utiliza al 
   > _servicio_ para comunicarse con el _modelo_.
>3. El _controlador_ no sabe nada del _modelo_ porque solo se comunica con el _servicio_.
>4. El _servicio_ es el que opera con la lógica. Es decir, los _servicios_ son la parte _lógica_ de nuestra 
    aplicación rest.
>5. El _servicio_ es quién se comunica directamente con el _modelo_.

### IMPORTANTE: Comando para curl en Windows

Para colocar un formato _json_ en curl de Windows, se debe colocar de la siguiente forma:
>"{\"clave\": \"valor\"}"

Luego de colocar la primera comilla doble (") va la llave de apertura ({), luego un caracter de escape seguido del 
inicio de la comilla doble (\"), ya que curl no reconoce las comillas simples (').

El _json_ debe escribirse así:

>curl -X POST localhost:8080/bootcampers -H "Content-Type: application/json" -d "{\"nombre\":\"OpenBootcamp\"}"
> 
>curl -X PUT localhost:8080/bootcampers -H "Content-Type: application/json" -d "{\"nombre\": \"seis\"}"
> 
> Nos muestra la URL del bootcamper creado:
> 
> curl -X POST localhost:8080/bootcampers -H "Content-Type: application/json" -d "{\"nombre\": \"seis\", \"valor\": 14.25}" -D - -v