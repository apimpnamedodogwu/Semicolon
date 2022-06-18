package bankingAppOriginal;

public class Account {


    private String name;
    private String password;
    private double balance;
    private int BVN;

    private String accountNumber;

    public int getBVN() {
        return BVN;
    }

    public Account(String name, String password, String accountNumber, int BVN) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.BVN = BVN;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            return;
        }
        throw new BankException("You are unable to deposit" + " " + amount + " " + "in this account!");
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            return;
        }
        throw new BankException("You are unable to withdraw" + " " + amount + " " + "because it exceeds your balance!");
    }

    @Override
    public String toString() {
        return String.format("""
                Account Name: %s
                Account Number: %s
                """, getName(), getAccountNumber());
    }


}
