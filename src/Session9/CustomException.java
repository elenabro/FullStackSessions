package Session9;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

}

public class CustomException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than 18.");
        } else {
            System.out.println("Valid age.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.nextLine();

        try {
            validateAge(age);
        } catch (InvalidAgeException invalidAgeException) {
            System.out.println("Invalid age. " + invalidAgeException.getMessage());
        } finally {
            scanner.close();
        }
    }
}