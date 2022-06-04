package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void CreateAccountTest() {
        Account myAccount = new Account();
        double balance = myAccount.getBalance();
        Assertions.assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void DepositForAccountTest() {
        Account myAccount = new Account();
        myAccount.depositBalance(1000);
        Assertions.assertEquals(1000, myAccount.getBalance());
    }

    @Test
    public void DepositTwiceForAccountTest() {
        Account myAccount = new Account();
        myAccount.depositBalance(4000);
        myAccount.depositBalance(5000);
        Assertions.assertEquals(9000, myAccount.getBalance());
    }

    @Test
    public void WithdrawForAccountTest() {
        Account myAccount = new Account();
        myAccount.depositBalance(9000);
        myAccount.withdrawBalance(10000);
        Assertions.assertEquals(9000, myAccount.getBalance());
    }

    @Test
    public void WithdrawForAccountTestTwo() {
        Account myAccount = new Account();
        myAccount.depositBalance(10000);
        myAccount.withdrawBalance(5000);
        assertEquals(5000, myAccount.getBalance());
    }


}
