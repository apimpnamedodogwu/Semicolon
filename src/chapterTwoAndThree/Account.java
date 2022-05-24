package chapterTwoAndThree;

public class Account {
    double balance;

    public double getBalance() {
        return balance;
    }

    public void depositBalance(double deposit) {
        if (deposit > 0.0) {
            balance = balance + deposit;
        }
    }

    public void withdrawBalance(double amount) {
        if (amount < balance) {
            balance = balance - amount;
        }

        else if (amount > balance) {
            System.out.print("You have exceeded your withdrawal limit.");
        }
    }


}