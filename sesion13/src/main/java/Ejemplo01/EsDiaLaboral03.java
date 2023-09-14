package Ejemplo01;

// Reemplazo de sentencia switch por if

public class EsDiaLaboral03 {
    public static void main(String[] args) {

    }

    public static boolean esDiaLborable(int dia) {
        // Mucho mejor, pero se puede mejorar aún más
        if (dia > 0 && dia < 6) {
            return true;
        }

        return false;
    }
}
