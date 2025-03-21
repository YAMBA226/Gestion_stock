package stock.com.stock.exception;

public class InvalidValue extends RuntimeException {
    public InvalidValue (String message) {
        super(message);
    }
}
