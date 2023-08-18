package com.openBootcamp;

public class FuncionRecursiva {

    public static void main(String[] args) {
        // System.out.println(sumaRecursiva(5));
        // tailRecursion(5);
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

        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        headRecursion(valor - 1);
        System.out.println(valor);
    }
}
