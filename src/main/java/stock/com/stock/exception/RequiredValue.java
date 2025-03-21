package stock.com.stock.exception;

public class RequiredValue extends RuntimeException {
    public RequiredValue (String message) {
        super(message);
    }
}
