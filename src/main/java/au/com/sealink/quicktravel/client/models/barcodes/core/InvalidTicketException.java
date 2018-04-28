package au.com.sealink.quicktravel.client.models.barcodes.core;

public class InvalidTicketException extends Exception {
    public InvalidTicketException() {
    }

    public InvalidTicketException(String message) {
        super(message);
    }

    public InvalidTicketException(Throwable cause) {
        super(cause);
    }

    public InvalidTicketException(String message, Throwable cause) {
        super(message, cause);
    }

}
