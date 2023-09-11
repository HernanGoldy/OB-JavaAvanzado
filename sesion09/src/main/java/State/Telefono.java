package State;

public class Telefono {
    public Estado estado;

    /*
    Cuando instancio una clase directamente ya le estoy asignando un estado por defecto
    1. El estado por defecto "Bloqueado"
    2. El estado es "Desbloqueado"
     */

    // constructor
    public Telefono() {
        estado = new EstadoBloqueado(this);
    }

    // method/function (behavior) para cambiar el estado en el que nos encontramos
    public void cambiaEstado(Estado estado) {
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    // un método para poder ver en qué estado se encuentra el teléfono
    public Estado getEstado() {
        return estado;
    }
}
