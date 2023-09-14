package Ejemplo03;

public class SumaInfinita {
    public static void main(String[] args) {
        System.out.println(sumarInfinitamente(1));
        System.out.println(sumarInfinitamente(1, 2));
        System.out.println(sumarInfinitamente(1, 2, 3, 4, 5, 6));
    }

    // función con argumentos variables
    public static int sumarInfinitamente(int ...numeros) {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }

        return resultado;
    }
}
