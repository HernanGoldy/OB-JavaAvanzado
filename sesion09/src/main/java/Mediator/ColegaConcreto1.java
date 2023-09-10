package Mediator;

public class ColegaConcreto1 extends Colega {
    // SÍ O SÍ debemos implementar las dos funciones abstractas de la clase Colega
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto1.");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1, envío un mensaje.");
        mediator.reenvia(this); // con this le digo al mediator que reciba mi mensaje
    }
}
