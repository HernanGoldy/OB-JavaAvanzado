package Iterator;

public interface UsuarioIterator {
    // Obtiene el siguiente
    Usuario siguiente();

    // ¿Hay más usuarios en el iterador?
    boolean hayMas();

    // Reinicia el contador (el iterador)
    void reinicia();


}
