package Session10;

import javax.swing.*;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

//    deposit  (amount > 0)

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(amount);
            System.out.println(" deposited " + amount);
        }
        else {
            System.out.println("Invalid amount");
        }

    }

//    withdraw (<= balance, amount > 0)

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(balance - amount);
            System.out.println("withdrawn " + amount + " new balance " + getBalance());
        } else{
            System.out.println("Not enough funds or amount is incorrect"    );
        }
    }



    public static void main(String[] args) {
//BankAccount bankAccount = new BankAccount();
//bankAccount.deposit(100);
//bankAccount.withdraw(50);


    }
}
