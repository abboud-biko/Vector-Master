public class diffrentLenghtException extends Exception {
    private String message;

    public diffrentLenghtException() {
        this.message = "les vecteurs de tailles differents";
    }

    public String getMessage() {
        return message;
    }
}
