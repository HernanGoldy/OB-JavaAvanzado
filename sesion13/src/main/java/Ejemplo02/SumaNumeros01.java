package Ejemplo02;

public class SumaNumeros01 {
    public static void main(String[] args) {
        int[] iNumeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int resultado = sumarNumeros(iNumeros);
    }

    // función monádica - programación imperativa
    public static int sumarNumeros(int[] numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }

        return resultado;
    }
}
