package com.openBootcamp.suma;

/*
IntStream.rangeClosed() -> tiene como cometido «generar números» y lo invocamos indicándole por parámetros cuál es el
 primer número y cuál es el último número.
 */


public class SumaRecursiva {

    public static void main(String[] args) {
        System.out.println(sumaRecursiva(5));
        System.out.print("Recursividad de cola: ");
        tailRecursion(5);
        System.out.println();
        System.out.print("Recursividad de cabeza: ");
        headRecursion(5);

    }

    // Recursividad de cola
    //  -> 5
    //      -> 5 - 1
    //          -> 4 - 1
    //              -> 3 - 1
    //                  -> 2 - 1
    //                      -> 1 - 1
    //                          -> 0 - 1
    //                              -> -1 - 1
    // sumaRecursiva(5)
    //      sumaRecursiva(4) // 5 - 1
    //          sumaRecursiva(3) // 4 - 1
    //              sumaRecursiva(2) // 3 - 1
    //                  sumaRecursiva(1) // 2 - 1
    public static int sumaRecursiva(int numero) {
        // Sentencia de control
        if (numero == 1) {
            return 1;
        }

        return numero + sumaRecursiva(numero - 1);
    }

    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        System.out.print(valor);
        tailRecursion(valor - 1);
    }

    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        headRecursion(valor - 1);
        System.out.print(valor);
    }
}
