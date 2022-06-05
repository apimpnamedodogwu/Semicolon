package bankingApp;

import java.util.Objects;
import java.util.UUID;

public class Bank {
    private String pin;
    private double balance;


    public Bank(String userPin) {
        pin = userPin;
    }

    public void createAccount(String typeOfAccount, double amountLimit, String pin) {
        typeOfAccount = "";
        amountLimit = 0;
    }

//    public boolean closeAccount(String userPin) {
//    }

    public void depositAmount(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }

    }

    public void withdraw(double amount, String userPin) {
        if (!Objects.equals(userPin, pin)) {
            System.out.println("Wrong pin. Try again.");
            return;
        }

        if (amount < balance) {
            balance = balance - amount;
        } else if (amount > balance) {
            System.out.print("You have exceeded your withdrawal limit.");
        }
    }


    public double viewBalance(String userPin) {
        if (!Objects.equals(userPin, pin)) {
            System.out.println("Wrong pin. Try again.");
        }
        return balance;
    }

    public boolean validatePin(String userPin) {
        return Objects.equals(userPin, pin);
    }

    public void transfer(String userPin, double amountToBeTransferred) {
        if (!Objects.equals(pin, userPin)) {
            System.out.println("Wrong pin. Try again.");
            return;
        }
        if (pin == userPin) {
            if (amountToBeTransferred > balance) {
                System.out.println("Insufficient amount.");
                return;
            }
            if (amountToBeTransferred < balance) {
                balance = balance - amountToBeTransferred;
            }
        }
    }
}
