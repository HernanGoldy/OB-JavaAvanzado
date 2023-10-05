package MicroEjemplos.S.bad;

/**
 * @apiNote Aquí se viola el SRP porque la clase Vehiculo no solo gestiona vehículos, sino que también accede a la
 * base de datos.
 */

public class Vehiculo {
    String tipo;

    // constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // getter
    public String getTipo() {
        return tipo;
    }

    // method
    public void guardaVehiculoEnDB() {
        // Conecto a la ddbb
        // Verifico que no esté previamente registrado
        // Inserto el registro
        // Finalizo
    }
}
