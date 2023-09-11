package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        // guarda la lista en memoria
        UsuariosMemoria usuarios = new UsuariosMemoria();
        usuarios.crear("Fulano");
        usuarios.crear("Mengano");
        usuarios.crear("Sultano");
        */

        // guarda la lista en disco
        UsuariosFichero usuarios = new UsuariosFichero();

        crear(usuarios, "Fulano");
        crear(usuarios, "Mengano");
        crear(usuarios, "Sultano");

        for (String usuario : listar(usuarios)) {
            System.out.println(usuario);
        }
    }

    // envoltorios
    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
