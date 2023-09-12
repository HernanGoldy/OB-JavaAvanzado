package MayorYMenor;

// A través de un array de números, decir cual el em mayor y el menor de los números.

public class MYM01SinRefactorizar {
    public static void main(String[] args) {
        int[] numeros = {12, 23, 45, 1, 9};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0]; // numeros[0] es un pivote

        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }

             if (menor > numeros[i]) {
                 menor = numeros[i];
             }
        }

        System.out.println("Mayor: " + mayor + " y Menor: " + menor);
    }
}
