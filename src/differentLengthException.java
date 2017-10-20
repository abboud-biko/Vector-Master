/**
 * The differentLengthException class is an exception thrown when a size of two vectors not equals
 */
public class differentLengthException extends Exception {
    /**
     * the shown message
     */
    private String message;

    /**
     * constructor for initialising the message
     */
    public differentLengthException() {
        this.message = "les vecteurs de tailles differents";
    }

    /**
     * get the value of the message
     * @return value of the message
     */
    public String getMessage() {
        return message;
    }
}
