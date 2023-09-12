package Funciones;
// Técnica Inlining
public class FuncionUnica {
    public static void main(String[] args) {
    }

    public boolean hoyEsDomingo(int numero) {
        boolean isDomingo = (numero == 7 ? true : false);

        if (isDomingo) {
            System.out.println(isDomingo);
        }

        return isDomingo;
    }
}
