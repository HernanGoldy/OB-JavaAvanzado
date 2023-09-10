package Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        // unimos a la receptora con los emisores
        emisora.meteReseptor(tv);
        emisora.meteReseptor(radio);
        emisora.meteReseptor(satelite);

        // mandamos la señal a todos los receptores
        emisora.emite();
    }
}
