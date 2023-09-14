package Ejemplo04;

import Ejemplo04.models.Usuario;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    /*
    // método que añade uno (único) usuario
    public void agregarUsuario(Usuario usuario) throws UserException {
        if (usuarios.contains(usuario)) {
            throw new UserRegisteredException(usuario.nombre);
        }
        usuarios.add(usuario);
    }
    */

    // método que añade múltiples usuarios
    public void agregarUsuarios(Usuario ...usuarios) throws UserException {
        for (Usuario usuario : usuarios) {
            if (this.usuarios.contains(usuario)) {
                throw new UserRegisteredException(usuario.nombre + " " + usuario.apellido);
            }

            this.usuarios.add(usuario);
        }
    }
}
