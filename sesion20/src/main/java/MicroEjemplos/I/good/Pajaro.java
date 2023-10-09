package MicroEjemplos.I.good;

public class Pajaro implements Animal, AnimalVolador {

    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }
}
