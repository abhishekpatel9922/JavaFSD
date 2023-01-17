package JavaBankProject;

import java.util.Scanner;

public class Account extends Bank implements AccountInterface {
    long account_no = 0;
    float account_balance = 0;
    String account_Type = "";

    public Account addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account no");
        this.account_no = sc.nextLong();
        System.out.println("Enter Account balanced");
        this.account_balance = sc.nextFloat();
        System.out.println("Enter Account type");
        this.account_Type = sc.next();
        return this;

    }

    public void deleteAccount() {

    }





    public void searchAccount() {

    }
    public void editAccount() {

    }
}




