package MicroEjemplos.D.bad;

/**
 * @apiNote Aquí no se cumple el DIP porque cada vez que se llame a una base de datos diferente, se tendrá que
 * modificar el código de los métodos dameDatos y tomaDatos.
 */

public class Datos {
    public BaseDeDatos bdd;

    public void dameDatos(BaseDeDatos bdd) {}

    public void tomaDatos(BaseDeDatos bdd) {}
}
