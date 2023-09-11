package State;

public class EstadoDesbloquedo extends Estado {
    // constructor por defecto
    public EstadoDesbloquedo(Telefono telefono) {
        super(telefono);
    }

    // SÍ O SÍ debemos implementar las tres funciones abstractas de la clase abstracta Estado
    @Override
    public String desbloquear() {
        return "desbloquear(): EL TELÉFONO YA ESTÁ DESBLOQUEADO!!!";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): La cámara está abierta, puedes tomar la foto.";
    }

    @Override
    public String tomarFoto() {
        return "tomarFoto(): No se puede tomar una foto sin antes abrir la cámara.";
    }
}
