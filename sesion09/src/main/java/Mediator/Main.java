package Mediator;

public class Main {
    public static void main(String[] args) {
        // creo un Mediador
        Mediator mediador = new MediadorConcreto();

        // creo los Colegas (instancio las clases derivadas)
        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        // registro (suscribo)
        mediador.registra(colega1);
        mediador.registra(colega2);
        mediador.registra(colega3);

        // colega1 habla y el resto recibe
        colega1.envia();

        // colega2 habla y el resto recibe
        colega2.envia();

        // colega3 habla y el resto recibe
        colega3.envia();
    }
}
