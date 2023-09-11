package State;

public class EstadoTomarFoto extends Estado {
    // constructor por defecto
    public EstadoTomarFoto(Telefono telefono) {
        super(telefono);
    }

    // SÍ O SÍ debemos implementar las tres funciones abstractas de la clase abstracta Estado
    @Override
    public String desbloquear() {
        return "desbloquear(): TELÉFONO YA DESBLOQUEADO!!!";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): CÁMARA YA ABIERTA!!!";
    }

    @Override
    public String tomarFoto() {
        // telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "tomarFoto(): La foto ya se ha tomado!!!";
    }
}
