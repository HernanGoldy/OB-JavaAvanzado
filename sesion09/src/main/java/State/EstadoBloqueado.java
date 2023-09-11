package State;

public class EstadoBloqueado extends Estado {
    // constructor por defecto
    public EstadoBloqueado(Telefono telefono) {
        super(telefono); // invocamos al constructor del padre
    }

    // SÍ O SÍ debemos implementar las tres funciones abstractas de la clase abstracta Estado
    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloquedo(telefono));
        return "desbloquear(): Teléfono desbloqueado, procede.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La cámara está bloqueada. Debes desbloquear el teléfono.";
    }

    @Override
    public String tomarFoto() {
        return "tomarFoto(): La cámara está bloqueada. Debes desbloquear el teléfono.";
    }
}
