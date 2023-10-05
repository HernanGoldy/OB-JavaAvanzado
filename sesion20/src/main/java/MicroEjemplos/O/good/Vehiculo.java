package MicroEjemplos.O.good;

abstract class Vehiculo {
    String tipo;

    // constructorer
    public Vehiculo() { };
    public Vehiculo(String tipo) { this.tipo = tipo; }

    // getter
    public String getTipo() {
        return tipo;
    }

    abstract int obtenerPotencia();
}
