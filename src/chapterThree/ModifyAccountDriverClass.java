package chapterThree;

import java.util.Scanner;

public class ModifyAccountDriverClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ModifyAccountClass account = new ModifyAccountClass("Ifeoluwa Roommate", 100.00);

        account.deposit(200);
        account.withdraw(100);
        System.out.printf("balance is %f", account.checkBalance());





    }
}
