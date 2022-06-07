package bankingApp;

import java.util.ArrayList;
import java.util.UUID;

public class Bank {

    private String nameOfBank;

     ArrayList<Customer> customers = new ArrayList<Customer>();
    Customer myCustomer = new Customer("", "Linda", "Domiciliary");

    public Bank (String bankName) {
        nameOfBank = bankName;
    }

//    public String getUserId() {
//        return userId;
//    }

    public void createAccount(String Id) {

    }

    public void addCustomer(Customer myCustomer) {
        customers.add(myCustomer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
