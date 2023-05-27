package exception.app.exception;

public class DBErrorException extends Error {
    public DBErrorException( String message) {
        super("My Application Exception - " + message);
    }
}
