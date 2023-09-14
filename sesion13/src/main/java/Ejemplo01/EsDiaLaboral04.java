package Ejemplo01;

// Reemplazo de sentencia switch por return directo

public class EsDiaLaboral04 {
    public static void main(String[] args) {
        boolean bEsDiaLaboral = esOtroDiaLaboral(5);
    }

    public static boolean esOtroDiaLaboral(int dia) {
        return (dia > 0 && dia < 6);
    }
}
