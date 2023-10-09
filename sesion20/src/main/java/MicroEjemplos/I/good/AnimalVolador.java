package MicroEjemplos.I.good;

/**
 * @apiNote Aquí se diseña una interface «acorde» a lo que diga su nombre (AnimalVolador) para que, cuando
 * implementemos esta interface, ésta sea «acorde» a los que va a hacer nuestra clase. - Se cumple con el ISP ya que la
 * clase Pajaro implementa tanto la interface Animal como la interface AnimalVolador y la clase Perro implementa
 * solamente la interface Animal.
 */

public interface AnimalVolador {
    public boolean volar();
}
