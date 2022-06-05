package origin;

public class Account {


    private String accountName;

    private int accountBalance;

    private int pin;


    public Account(String name, int c) {

        this.accountName = name;

        this.accountBalance = c;

    }

    public void deposit(int amount) {

        this.accountBalance = accountBalance + amount;

    }

    public void withdraw(int amount) {

        this.accountBalance = accountBalance - amount;

    }

    public int checkBalance() {

        return this.accountBalance;

    }

    public String getAccountName() {

        return this.accountName;

    }


}



