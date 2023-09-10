package Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator {
    ArrayList<Colega> colegas = new ArrayList<>();

    // SÍ O SÍ debemos implementar las dos funciones abstractas de la clase Mediator
    @Override
    void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this); // nos creamos el Mediador Concreto para esta clase
        }
    }

    @Override
    void reenvia(Colega colega) {
        for (Colega actual : colegas) {
            if (!actual.equals(colega)) { // evitamos enviarnos el mensaje a nosotros mismos
                actual.recibe();
            }
        }
    }
}
