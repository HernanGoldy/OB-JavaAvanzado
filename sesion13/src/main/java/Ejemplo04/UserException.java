package Ejemplo04;

public class UserException extends Exception {
    // constructor
    public UserException(String message) {
        super("UserException: " + message);
    }
}
