package MayorYMenor;

// Refactor con forEach y Operador Ternario

public class MYM03RefactorConForEach {
    public static void main(String[] args) {
        int[] numeros = {12, 23, 45, 1, 9};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0]; // numeros[0] es un pivote

        for (int i : numeros) { // forEach - forma corta del for
            mayor = mayor < i ? i : mayor; // forma corta del if
            menor = menor > i ? i : menor;
        }

        System.out.println("Mayor: " + mayor + " y Menor: " + menor);
    }
}
