package Session8.SMS;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidationException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 150) {
            throw new InvalidAgeException("Invalid age. ");
        } else {}
    }
}