package practice7.exceptions;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String messge) {
        super(messge);
    }
}
