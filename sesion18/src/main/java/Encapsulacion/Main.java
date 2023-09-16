package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ana");
        usuario.setApellido("Perez");

        System.out.println("Nuevo usuario: " + usuario.getNombre() + " " + usuario.getApellido());
    }
}
