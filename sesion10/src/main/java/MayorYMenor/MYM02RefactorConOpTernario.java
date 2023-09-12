package MayorYMenor;

// El Operador Ternario compara ya asigna - forma corta del if

public class MYM02RefactorConOpTernario {
    public static void main(String[] args) {
        int[] numeros = {12, 23, 45, 1, 9};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0]; // numeros[0] es un pivote

        for (int i = 0; i < numeros.length; i++) {
            mayor = mayor < numeros[i] ? numeros[i] : mayor; // forma corta del if
            menor = menor > numeros[i]? numeros[i] : menor;
        }

        System.out.println("Mayor: " + mayor + " y Menor: " + menor);
    }
}
