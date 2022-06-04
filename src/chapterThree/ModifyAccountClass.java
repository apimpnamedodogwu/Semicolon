package chapterThree;

public class ModifyAccountClass {

    private String accountName;
    private double balance;

    public ModifyAccountClass(String name, double startingBalance) {
        accountName = name;

        if (startingBalance > 0.0) {

            balance = startingBalance;
        }
    }

    public void deposit(double depositFund) {
        if (depositFund > 0.0) {
            balance = balance + depositFund;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public double withdraw(double amount) {
        if(amount > balance){
            System.out.println("Withdrawal amount exceeded balance");
        } else {
            balance = balance - amount;
        }

        return balance;

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}






















































