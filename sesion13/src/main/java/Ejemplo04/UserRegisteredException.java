package Ejemplo04;

public class UserRegisteredException extends UserException {
    public UserRegisteredException(String message) {
        super("El usuario '" + message + "' ya existe.");
    }
}
