package Session17.SMS;

class IllegalAgeException extends Exception {
    public IllegalAgeException(String message) {
        super(message);
    }
}

public class AgeValidationException {

    public static void validateAge(int age) throws IllegalAgeException {
        if (age < 18 || age > 150) {
            throw new IllegalAgeException("Invalid age. ");
        } else {}
    }
}