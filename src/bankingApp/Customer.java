package bankingApp;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Customer {
    private String customerId;
    private String customerName;


    ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.customerId = UUID.randomUUID().toString();
        customerName = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccount() {
        return accounts;
    }

    public void customerDeposit(String accountNumber) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                account.depositAmount(5000);
            }
        }
        throw new IllegalArgumentException(accountNumber + " does not exist.");
    }

    public void customerWithdraw(String accountNumber) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                account.withdraw(5000, "1234");
            }
        }
        throw new IllegalArgumentException(accountNumber + " does not exist.");

    }

    private void closeCustomerAccount(String accountNumber) {
        for (int index = 0; index < accounts.size(); index++) {
            if (Objects.equals(accounts.get(index).getAccountNumber(), accountNumber)) {
                accounts.remove(index);
                System.out.println("Your account has been successfully closed and we are sorry to see you go!");
                return;
            }
        }
        throw new IllegalArgumentException(accountNumber + " does not exist.");
    }


}

