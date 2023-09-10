package Observer;

import java.util.ArrayList;

public class Emisora {
    // creamos la lista de los emisores
    private ArrayList<Receptor> receptor = new ArrayList<>();

    // methods
    // creamos una función para meter a alguien dentro del ArrayList
    public void meteReseptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    // notificamos a todos los receptores mediante un método
    public void emite() {
        for (Receptor receptor : receptor) {
            receptor.recibe();
        }
    }

}
