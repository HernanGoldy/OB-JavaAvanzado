package State;

public class Main {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono();
        System.out.println(tel1.estado.desbloquear());
        // System.out.println(tel1.estado.desbloquear()); // EL TELÉFONO YA ESTÁ DESBLOQUEADO!!!

        System.out.println(tel1.estado.abrirCamara());
        // System.out.println(tel1.estado.desbloquear()); // YA ESTÁ DESBLOQUEADO EL TELÉFONO!!!
        // System.out.println(tel1.estado.abrirCamara()); // LA CÁMARA YA ESTÁ ABIERTA!!!

        System.out.println(tel1.estado.tomarFoto()); // Ya puedes tomar la foto.
        // System.out.println(tel1.estado.desbloquear()); // TELÉFONO YA DESBLOQUEADO!!!
        // System.out.println(tel1.estado.abrirCamara()); // CÁMARA YA ABIERTA!!!

        System.out.println(tel1.estado.tomarFoto()); // La foto ya se ha tomado!!!
    }
}
