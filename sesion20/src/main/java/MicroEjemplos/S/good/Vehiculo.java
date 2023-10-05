package MicroEjemplos.S.good;

/**
 * @apiNote Aquí se crean 2 capas en donde la 2ª capa (VehiculoDB) necesita de la 1ª capa (Vehiculo) - Se cumple con
 * el SRP porque la clase Vehiculo se encarga únicamente de gestionar vehículos y delega la responsabilidad de
 * gestionar la base de datos a la clase VehiculoDB.
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
}


