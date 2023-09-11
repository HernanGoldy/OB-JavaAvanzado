package State;

public abstract class Estado {
    public Telefono telefono;

    // función que va a indicar en qué estado se encuentra el programa
    public Estado(Telefono telefono) {
        this.telefono = telefono;
    }

    // defino tres funciones que cada estado tiene que implementar
    public abstract String desbloquear();
    public abstract String abrirCamara();
    public abstract String tomarFoto();
}
