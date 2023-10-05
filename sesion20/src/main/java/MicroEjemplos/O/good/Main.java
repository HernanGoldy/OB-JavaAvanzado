package MicroEjemplos.O.good;

/**
 * @apiNote Aquí se crea una clase «padre» abstracta (Vehiculo) que contiene un método abstracto obtenerPotencia() y
 * luego se crean las clases derivadas/hijas/subclases (Coche, Moto y Furgoneta) que implementan (obligatoriamente)
 * el método abstracto de la clase principal (Vehiculo) - Se cumple con el OCP porque creamos un objeto «abierto para
 * su extención» (clase abstracta Vehiculo) al cual lo estamos «extendiendo» a travéz de sus clases hijas (clase
 * Coche, clase Moto, clase Furgoneta) pero «cerrado para su modificación» porque no tivimos que modificar nada en el
 * Main (imprimePotencia(vehiculos);).
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche(),
                new Moto(),
                new Furgoneta()
        };

        imprimePotencia(vehiculos);
    }

    public static void imprimePotencia(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerPotencia());
        }
    }
}
