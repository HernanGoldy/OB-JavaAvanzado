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

.filter() -> Filtra y elimina información
Arrays.stream(nombreVariable) -> De esta forma convertimos un array (por ej. de números) a un stream

.reduce() -> Toma todos los elementos que quedan del .filter() y lo reduce a una expresión.

NOTA: Al .reduce() hay que darle una variable (o valor) inicial.
        Si es un string se le coloca una comilla doble.
        Si es un int se le coloca 0.
        Si es un double se le coloca 0.0.
        Si es un boolean se le coloca false.
        Si es un char se le coloca un carácter vacío.
      Y en el caso de ser un int a continuación se le pasa la expresión de reducción. Es decir, cómo va a reducir los
       los números.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Funcionales f = new Funcionales();
        // f.pruebasFunciones();

        // llamamos al método
        // System.out.println(toMayuscula("Juan"));

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Marta");
        nombres.add("Sonia");
        nombres.add("Soledad");

        // 1.1. Forma funcional o declarativa
        // nombres.stream().forEach(System.out::println); // 1. método sencillo (version corta de una lamda)
        // nombres.stream().forEach(x -> System.out.println(x)); // 2. método sencillo con lamda (en desuso)
        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())  // 3. convierte cada elemento del String a mayúsculas
                .filter(x -> x.startsWith("S")); // solo quiero que se guarden en el stream lo empiezan con "S"
        valores.forEach(x -> System.out.println(x));

        // 1.2.Forma imperativa (tradicional)
        /*
        for (String nombre : nombres) {
            System.out.println(nombre);
        }*/


        // EJEMPLO: Convertir un array de números a stream y sumar solo los números pares.
        // 2.1.Forma funcional o declarativa
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros)
                .filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
                    System.out.println("'x' vale " + x + " e " + "'y' vale " + y);
                    return x + y;
                });

        // 2.2.Forma imperativa (tradicional)
        int sumaTotal = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                continue;
            }
            sumaTotal += numero;
        }

        System.out.println("La suma total de los números pares es:\nForma funcional: " + stNumeros + "\nForma " +
                "imperativa: " + sumaTotal);
    }
}
