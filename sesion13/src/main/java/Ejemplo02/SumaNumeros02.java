package Ejemplo02;

import java.util.Arrays;

public class SumaNumeros02 {
    public static void main(String[] args) {
        int[] iNumeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int resultado = sumarNumeros(iNumeros);
    }

    // función monádica - programación declarativa
    public static int sumarNumeros(int[] numeros) {
        return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
    }
}
