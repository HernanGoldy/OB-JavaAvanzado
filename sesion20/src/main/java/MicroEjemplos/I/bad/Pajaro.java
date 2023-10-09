package MicroEjemplos.I.bad;

public class Pajaro implements Animal {

    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }
}
