package Ejemplo01;

// Funciones con abusos de sentencia switch

public class EsDiaLaboral02 {
    public static void main(String[] args) {

    }

    public static boolean esUnDiaLaboral(int dia) {
        // Un poco más corto. Falta mejorar
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
