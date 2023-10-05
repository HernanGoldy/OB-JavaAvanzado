package MicroEjemplos.O.bad;

/**
 * @apiNote Aquí no se cumple el OCP porque, por cada uno de los vehículos que creamos, tendremos que hacerle una
 * modificación a la clase principal.
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Vehiculo("Coche"),
                new Vehiculo("Moto"),
                new Vehiculo("Furgoneta")
        };

        imprimePotencia(vehiculos);
    }

    public static void imprimePotencia(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.tipo.equalsIgnoreCase("coche")) {
                System.out.println("1000");
            } else if (vehiculo.tipo.equalsIgnoreCase("moto")) {
                System.out.println("500");
            } else if (vehiculo.tipo.equalsIgnoreCase("furgoneta")) {
                System.out.println("750");
            }
        }
    }
}
