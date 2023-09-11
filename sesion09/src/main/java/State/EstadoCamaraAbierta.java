package State;

public class EstadoCamaraAbierta extends Estado {
    // constructor por defecto
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    // SÍ O SÍ debemos implementar las tres funciones abstractas de la clase abstracta Estado
    @Override
    public String desbloquear() {
        return "desbloquear(): YA ESTÁ DESBLOQUEADO EL TELÉFONO!!!";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): LA CÁMARA YA ESTÁ ABIERTA!!!";
    }

    @Override
    public String tomarFoto() {
        telefono.cambiaEstado(new EstadoTomarFoto(telefono));
        return "tomarFoto(): Ya puedes tomar la foto.";
    }
}
