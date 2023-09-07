package com.openbootcamp.builder;

public class CocheBuilder {

    // atributos (características)
    Vehiculo vehiculo;

    // constructores
    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    // métodos/funciones (comportamientos)
    public CocheBuilder setPuertas(int puertas) {
        vehiculo.setPuertas(puertas);
        return this; // this significa la instancia actual de mi clase (se devuelve a sí misma)
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.setMotor(motor);
        return this;
    }

    // método que SIEMPRE IMPLEMENTAMOS al crear un Builder
    public Vehiculo build() {
        return this.vehiculo;
    }
}
