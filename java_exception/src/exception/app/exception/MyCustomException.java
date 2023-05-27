package exception.app.exception;

public class MyCustomException extends Throwable{
    public MyCustomException (String message) {
        super("My Application Exception - " + message);
    }
}
