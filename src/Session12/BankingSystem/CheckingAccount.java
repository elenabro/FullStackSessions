package Session12.BankingSystem;

public class CheckingAccount extends BankAccount implements Transaction {

    private double overdraftLimit;


    public CheckingAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) throws InvalidWithdrawException {
        if (amount > 0 && (getBalance() - amount >= -overdraftLimit) ){
            super.withdraw(amount);
        } else {
            throw new InvalidWithdrawException("Invalid withdraw amount");
        }
    }

    @Override
    public void displayAccountData() {
        System.out.println("Checking account: " + getAccountNumber());
        System.out.println("Account holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft limit: " + overdraftLimit);
    }


}
