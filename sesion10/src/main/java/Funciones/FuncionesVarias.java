package Funciones;

public class FuncionesVarias {
    public static void main(String[] args) {
    }

    public boolean hoyEsDomingo(int numero) {
        boolean isDomingo = hoyEsDiaNumero(numero);
        if (isDomingo) {
            System.out.println(isDomingo);
        }

        return isDomingo;
    }

    public static boolean hoyEsDiaNumero(int numero) {
        if (numero == 7) {
            return true;
        }

        return false;
    }
}
