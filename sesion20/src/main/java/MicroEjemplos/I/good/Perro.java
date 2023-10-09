package MicroEjemplos.I.good;

/**
 * @apiNote Aquí no se cumple el ISP porque la interface Animal tiene un error de diseño al decir que todos los
 * animales vuelan.
 */

public class Perro implements Animal {

    @Override
    public boolean beber() {
        return false;
    }
}
