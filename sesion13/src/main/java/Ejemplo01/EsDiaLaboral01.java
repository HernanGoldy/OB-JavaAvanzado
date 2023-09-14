package Ejemplo01;

// Funciones con abusos de sentencia switch

public class EsDiaLaboral01 {
    public static void main(String[] args) {

    }

    public static boolean esDiaLaboral(int dia) {
        // Muy largo
        switch (dia) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            default:
                return false;
        }
    }
}
