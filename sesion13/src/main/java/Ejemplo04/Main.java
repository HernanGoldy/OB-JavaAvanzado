package Ejemplo04;

import Ejemplo04.models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();

        Usuario usuario1 = new Usuario();
        usuario1.nombre = "Juan";
        usuario1.apellido = "Pérez";
        usuario1.edad = 25;
        usuario1.puedeConducir = true;

        Usuario usuario2 = new Usuario();
        usuario2.nombre = "Ana";
        usuario2.apellido = "Gómez";
        usuario2.edad = 15;
        usuario2.puedeConducir = false;

        try {
            usuarios.agregarUsuarios(usuario1);
            usuarios.agregarUsuarios(usuario2);
            usuarios.agregarUsuarios(usuario2);
        } catch (UserException e) {
            System.out.println("Error al agregar objeto de usuario - " + e.getMessage());
        }
    }
}
