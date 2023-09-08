package Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {
    // creamos la lista para almacenar los usuarios
    private ArrayList<Usuario> usuarios = new ArrayList();

    private int posision = 0;

    // creamos las funciones para poder crear los usuarios
    public void crear(Usuario usuario) {
        usuarios.add(usuario);
    }

    // los tres métodos que definen nuestra interfase
    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(posision);
        posision ++;
        return usuario;
    }

    @Override
    public boolean hayMas() {
        return posision < usuarios.size();
    }

    @Override
    public void reinicia() {
        posision = 0;
    }
}
