package global.banking.platform.exception;

public class IncompleteTransferDetailsException extends RuntimeException {
    public IncompleteTransferDetailsException(String message) {
        super(message);
    }
}
