package JavaOops;
import java.util.Scanner;

public class ATM {
    String name;
    int account;
    int balance;
    int withdraw;

    void display() {
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number : " + account);
        System.out.println("Account Balance : " + balance);
        System.out.println("Withdraw : " + withdraw);
    }

    public static void main(String args[]) {
        Scanner nt = new Scanner(System.in);
        ATM T = new ATM();

        System.out.println("Enter the Account Holder Name : ");
        T.name = "Nithin";

        System.out.println("Enter the Account Number : ");
        T.account = 231;

        System.out.println("Enter the Account Balance : ");
        T.balance = 1000;

        System.out.println("Enter the Withdraw Amount : ");
        T.withdraw = nt.nextInt();

        if (T.balance >= T.withdraw) {
            System.out.println("Sufficient Balance");
            T.balance = T.balance - T.withdraw;
            System.out.println("Remaining Balance : " + T.balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        T.display();
    }
}