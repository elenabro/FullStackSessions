package Session17.SMS;

public class IllegalEmailException extends RuntimeException {

    /**
     * Constructs a new IllegalEmailException with the specified detail message.
     *
     * @param message the detail message
     */
    public IllegalEmailException(String message) {
        super(message);
    }
}
