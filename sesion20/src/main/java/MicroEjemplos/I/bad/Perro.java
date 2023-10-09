package MicroEjemplos.I.bad;

/**
 * @apiNote Aquí no se cumple el ISP porque la interface Animal tiene un error de diseño al decir que todos los
 * animales vuelan.
 */

public class Perro implements Animal{

    @Override
    public boolean beber() {
        return false;
    }

    // Pero... los perros no vuelan ❗❗❗❗❗❗❗❗
    @Override
    public boolean volar() {
        return false;
    }
}
