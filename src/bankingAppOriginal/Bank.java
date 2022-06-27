package bankingAppOriginal;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void registerACustomer(String name, Gender gender, int age) {
        Customer myCustomer = new Customer(name, Gender.NON_BINARY, age);
        customers.add(myCustomer);
    }

    public Customer getACustomer(int BVN) {
        for (Customer customer : customers) {
            if (customer.getBVN() == BVN) {
                return customer;
            }
        }
        throw new BankException(BVN + " " + "does not exist!");
    }

    public void createAccount(String name, String password, String accountNumber, int BVN) {

        Account myAccount = new Account(name, password, accountNumber, BVN);
        accounts.add(myAccount);
    }

    public Account getAnAccount(String accountNumber) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                return account;
            }
        }
        throw new BankException(accountNumber + " " + "does not exist!");
    }

    public void closeAccount(String password, String accountNumber) {
        for (Account myAccount : accounts) {
            if (Objects.equals(myAccount.getAccountNumber(), accountNumber)) {
                if (Objects.equals(myAccount.getPassword(), password)) {
                    accounts.remove(myAccount);
                }
            }
            System.out.println("Your account has been closed successfully!");
            return;
        }
        throw new IllegalArgumentException("This account does not exist!");
    }

    public double viewAccountBalance(String password, String accountNumber) {
        for (Account myAccount : accounts) {
            if (Objects.equals(myAccount.getPassword(), password)) {
                if (Objects.equals(myAccount.getAccountNumber(), accountNumber)) {
                    return myAccount.getBalance();
                }
            }
        }
        throw new IllegalArgumentException("You are unable to view balance!");
    }

    public void depositAmount(double amount, String accountNumber) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                account.deposit(amount);
            }
        }
    }


    public ArrayList<Account> getCustomerAccounts(int BVN) {
        ArrayList<Account> allCustomerAccount = new ArrayList<Account>();
        for (Account account : accounts) {
            if (account.getBVN() == BVN) {
                allCustomerAccount.add(account);
            }
        }
        if (allCustomerAccount.size() == 0) {
            throw new BankException("Your account does not exist!");
        } else {
            return allCustomerAccount;
        }
    }


    public void withdrawAmount(double amount, String password, String accountNumber) {
        for (Account account : accounts) {
            if (Objects.equals(account.getPassword(), password) && Objects.equals(account.getAccountNumber(), accountNumber)) {
                account.withdraw(amount);
            }
        }
    }

    public void transferAmount(double amountToBeTransferred, String password, String accountNumber, String accountNumberToTransferTo) {
        Account sendingAccount = null;
        Account receivingAccount = null;
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                sendingAccount = account;
            }
            if (Objects.equals(account.getAccountNumber(), accountNumberToTransferTo)) {
                receivingAccount = account;
            }
        }
        if (sendingAccount == null) {
            throw new BankException(accountNumber + " " + "does not exist!");
        }

        if (receivingAccount == null) {
            throw new BankException(accountNumberToTransferTo + " " + "does not exist!");
        }

        sendingAccount.withdraw(amountToBeTransferred);
        receivingAccount.deposit(amountToBeTransferred);
    }


}
