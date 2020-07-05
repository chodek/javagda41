package adnotacje;

public class IncorrectValueOfParameterException extends RuntimeException {
    String message;

    public IncorrectValueOfParameterException(String message) {
        this.message = message;
    }

    public IncorrectValueOfParameterException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
