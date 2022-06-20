
package bankingAppOriginal;

import java.util.ArrayList;
import java.util.Scanner;

public class bankDriver {
    static Bank myBank;
    private static final Scanner myKeyboard = new Scanner(System.in);

    public static void main(String[] args) {
    myBank = new Bank();

        accountAndCustomerDummy();

        int sentinel = 0;

        try {
            while (sentinel != -1) {

                System.out.println("""
                        Welcome to Ego Oyigbo International Bank!
                        Press 1 -> to register as a customer.
                        Press 2 -> to retrieve customer details.
                        Press 3 -> to create an account.
                        Press 4 -> retrieve account details.
                        Press 5 -> to close an account.
                        Press 6 -> to make a deposit.
                        Press 7 -> to make a withdrawal.
                        Press 8 -> to make a transfer.
                        Press 9 -> to view account balance.
                        Press 10 -> to view all accounts
                        Press 11 -> to view all customers
                        Press 0 -> to quit.
                        """);
                int userInput = myKeyboard.nextInt();
                switch (userInput) {
                    case 1 -> {
                        register();
                    }
                    case 2 -> {
                        System.out.println("Enter your Bank Verification Number: ");
                        int BVN = myKeyboard.nextInt();
                        myBank.getACustomer(BVN);
                    }
                    case 3 -> {
                        System.out.println("""
                                Enter name:
                                Enter password:
                                Enter account number:
                                Enter BVN here:
                                """);
                        String name = myKeyboard.next();
                        String password = myKeyboard.next();
                        String accountNumber = myKeyboard.next();
                        int BVN = myKeyboard.nextInt();
                        myBank.createAccount(name, password, accountNumber, BVN);
                    }
                    case 4 -> {
                        System.out.println("Enter account number: ");
                        String accountNumber = myKeyboard.next();
                        myBank.getAnAccount(accountNumber);
                    }
                    case 5 -> {
                        System.out.println("""
                                Enter password here:
                                Enter account number:""");
                        String password = myKeyboard.next();
                        String accountNumber = myKeyboard.next();
                        myBank.closeAccount(password, accountNumber);
                    }
                    case 6 -> {
                        System.out.println("""
                                Enter amount to be deposited:
                                Enter account number:""");
                        double amount = myKeyboard.nextDouble();
                        String accountNumber = myKeyboard.next();
                        myBank.depositAmount(amount, accountNumber);
                    }
                    case 7 -> {
                        System.out.println("""
                                Enter amount:
                                Enter password:
                                Enter account number:
                                """);
                        double amount = myKeyboard.nextDouble();
                        String password = myKeyboard.next();
                        String accountNumber = myKeyboard.next();
                        myBank.withdrawAmount(amount, password, accountNumber);
                    }
                    case 8 -> {
                        System.out.println("""
                                Enter amount:
                                Enter password:
                                Enter sender's account number:
                                Enter receiver's account number:
                                """);
                        double amount = myKeyboard.nextDouble();
                        String password = myKeyboard.next();
                        String accountNumberOfSender = myKeyboard.next();
                        String accountNumberOfReceiver = myKeyboard.next();
                        myBank.transferAmount(amount, password, accountNumberOfSender, accountNumberOfReceiver);
                    }
                    case 9 -> {
                        System.out.println("""
                                Enter password:
                                Enter account number:""");
                        String password = myKeyboard.next();
                        String accountNumber = myKeyboard.next();
                        myBank.viewAccountBalance(password, accountNumber);
                    }
                    case 10 -> {

                    }
                    case 0 -> sentinel = -1;
                    default -> main(args);

                }

            }
        } catch (IllegalArgumentException | NullPointerException illegal) {
            System.out.println(illegal.getMessage());
            main(args);
        }

    }

    private static void accountAndCustomerDummy() {
        ArrayList<Account> myAccountList = new ArrayList<Account>();
        ArrayList<Customer> myCustomerList = new ArrayList<>();
        Account myAccount = new Account("Eden", "1234", "1111", 1);
        Account myAccountTwo = new Account("Eden,", "1234", "2222", 1);
        Account myAccountThree = new Account("Dorcas", "1235", "3333", 2);
        Customer myCustomer = new Customer("Eden", Gender.FEMALE, 29);
        Customer myCustomerTwo = new Customer("Dorcas", Gender.FEMALE, 29);
        myAccountList.add(myAccount);
        myAccountList.add(myAccountTwo);
        myAccountList.add(myAccountThree);
        myCustomerList.add(myCustomer);
        myCustomerList.add(myCustomerTwo);

    }

    private static void register() {
        System.out.println("""
                Enter name here:
                Enter gender here:
                Enter age here:
                """);
        String name = myKeyboard.next();
        String gender = myKeyboard.next();
        Gender userGender = Gender.RATHER_NOT_SAY;
        if (gender.equalsIgnoreCase("Male")) {
            userGender = Gender.MALE;
        }
        if (gender.equalsIgnoreCase("Female")) {
            userGender = Gender.FEMALE;
        }
        if (gender.equalsIgnoreCase("Non binary")) {
            userGender = Gender.NON_BINARY;
        }
        if (gender.equalsIgnoreCase("Trans gender")) {
            userGender = Gender.TRANS_GENDER;
        }
        int age = myKeyboard.nextInt();
        myBank.registerACustomer(name, userGender, age);
    }
}
