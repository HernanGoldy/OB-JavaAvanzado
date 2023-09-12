package MayorYMenor;
// Refactorización con Programación Funcional
import java.util.Arrays;

public class MYM04RefactorConProgFuncional {
    public static void main(String[] args) {
        int[] numeros = {12, 23, 45, 1, 9};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b); // numeros[0] es un pivote

        System.out.println("Mayor: " + mayor + " y Menor: " + menor);
    }
}
