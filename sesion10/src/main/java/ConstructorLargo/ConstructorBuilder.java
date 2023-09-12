package ConstructorLargo;

public class ConstructorBuilder {
    // attributes
    private String marca;
    private String modelo;
    private String motor;
    private int puertas;

    // constructors
    private ConstructorBuilder() {}
    public ConstructorBuilder(String marca) {
        this.marca = marca;
    }

    public ConstructorBuilder conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ConstructorBuilder conMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public ConstructorBuilder conPuertas(int puertas) {
        this.puertas = puertas;
        return this;
    }
}
