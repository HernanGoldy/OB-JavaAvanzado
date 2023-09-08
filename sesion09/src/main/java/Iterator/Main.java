package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 15));
        usuarios.crear(new Usuario("tres", 10));
        usuarios.crear(new Usuario("cuatro", 8));

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("El usuario es: " + usuario.getNombre());
        }

        // si creamos un nuevo usuario
        usuarios.crear(new Usuario("cinco", 25));
        Usuario usuario = usuarios.siguiente();
        System.out.println("El usuario es: " + usuario.getNombre());

        // ponemos el contador a 0
        usuarios.reinicia();
        while (usuarios.hayMas()) {
            usuario = usuarios.siguiente();
            System.out.println("El usuario es: " + usuario.getNombre());
        }
    }
}
