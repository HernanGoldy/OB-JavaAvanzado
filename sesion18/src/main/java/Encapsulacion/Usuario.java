package Encapsulacion;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean esFemenino;

    /**
     * Cohesionamos la clase Usuario con la clase Acceso.
     */
    public String getNombre() {
        Acceso acceso = new Acceso();
        acceso.setIntentos(acceso.getIntentos() + 1);

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

        EnviarCorreo correo = new EnviarCorreo();
        correo.enviarCorreoDeBienvenida(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esFemenino() {
        return esFemenino;
    }

    public void setEsFemenino(boolean esFemenino) {
        this.esFemenino = esFemenino;
    }
}
