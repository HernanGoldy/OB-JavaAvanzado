package com.openBootcamp.funcionesDeAltoNivel;

/*
El ejercicio muestra dos formas de convertir una cadena de texto a mayusculas.
.stream() -> Toma el dato que le pedimos y no los da.
    Ventajas:
    - No necesita declarar una variable.
    - Nos hace el forEach automáticamente.
    Desventajas:
    - Se consume: una vez recorrido el String, el stream no lo podemos volver a utilizar.

.map() -> Por cada resultado generado por «.stream()» le aplica otra función. Es decir, la función .map() aplica lo
que le indicamos sobre cada elemento que recibimos de un .stream()
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Funcionales f = new Funcionales();
        f.pruebasFunciones();

        // llamamos al método
        System.out.println(toMayuscula("Juan"));

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Marta");
        nombres.add("Sonia");

        // Forma funcional
        nombres.stream().forEach(System.out::println); // 1. método sencillo (version corta de una lamda)
        nombres.stream().forEach(x -> System.out.println(x)); // 2. método sencillo con lamda (en desuso)
        Stream<String> valores = nombres.stream()
                .map(y -> "Hola " + y.toUpperCase()); // 3. convierte cada elemento del String a mayúsculas
        valores.forEach(z -> System.out.println(z));

        // Forma tradicional
        /*
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        */
    }

    // 2. Método (no funcional)
    public static String toMayuscula(String nombre) {
        return nombre.toUpperCase();
    }
}
