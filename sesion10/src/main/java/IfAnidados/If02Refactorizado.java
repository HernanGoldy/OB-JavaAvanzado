package IfAnidados;

// Técnica de extracción de valor de retorno

public class If02Refactorizado {
    public static void main(String[] args) {
        System.out.println("El mayor valor de ambos enteros es: " + ifTradicional());
    }

    public static int ifTradicional() {
        int valor1 = 10;
        int valor2 = 20;

        if (valor1 > valor2) {
            return valor1;
        }

        return valor2;
    }
}
