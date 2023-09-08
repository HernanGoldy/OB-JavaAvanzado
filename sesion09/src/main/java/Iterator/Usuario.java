package Iterator;

// Esta clase solo va a obtener la información de un usuario.

public class Usuario {
    // atributos
    private String nombre;
    private int edad;


    // constructores
    private Usuario() {
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
