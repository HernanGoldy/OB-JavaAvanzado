package MicroEjemplos.D.good;

/**
 * @apiNote Aquí se diseña una interface general (BaseDeDatos) y se crean dos clases (BDDMySQL y BDDFile) que
 * trabajan con bases de datos diferentes y que implementan la interface BaseDeDatos. - Se cumple con el DIP porque
 * se crea una clase «genérica» (Datos) que va a contener las clases BDDMySQL y BDDFile (intercambiables una por
 * otra) y en la cual éstas van a contener (a su vez) toda la lógica de la conexión a la base de datos a la que hagan
 * referencia.
 */

public class Main {
    public static void main(String[] args) {
        Datos datos = new Datos();

        BDDFile db = new BDDFile();
        BDDMySQL db2 = new BDDMySQL();

        datos.dameDatos(db);
        datos.tomaDatos(db2);
    }
}
