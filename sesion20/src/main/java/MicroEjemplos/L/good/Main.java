package MicroEjemplos.L.good;

/**
 * @apiNote Aquí se crea una clase «padre» abstracta (Vehiculo) que contiene un método abstracto obtenerPotencia() y
 * luego se crean las clases derivadas/hijas/subclases (Coche, Moto y Furgoneta) que implementan (obligatoriamente)
 * el método abstracto de la clase principal (Vehiculo) - Se cumple con el LSP porque al sustituir la clase Moto por
 * la clase Furgoneta, el código sigue fuincionando.
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche(),
                new Moto(),
                new Furgoneta()
        };

        imprimePotencia(vehiculos);

        // Moto moto = new Moto();
        Furgoneta moto = new Furgoneta();
        System.out.println("Potencia obtenida: " + moto.obtenerPotencia());
    }

    public static void imprimePotencia(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerPotencia());
        }
    }
}
