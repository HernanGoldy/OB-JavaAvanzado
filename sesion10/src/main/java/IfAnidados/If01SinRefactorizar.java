package IfAnidados;

// Devolver el mayor numero de un entero

public class If01SinRefactorizar {
    public static void main(String[] args) {
        System.out.println("El mayor valor de ambos enteros es: " + ifTradicional());
    }

    public static int ifTradicional() {
        int valor1 = 10;
        int valor2 = 20;

        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
