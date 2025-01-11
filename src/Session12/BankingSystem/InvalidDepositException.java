package Session12.BankingSystem;

public class InvalidDepositException extends Throwable{

    public InvalidDepositException(String message) {
        super(message);
    }
}
