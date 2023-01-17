package JavaBankProject;

import java.util.Scanner;

public class Customer implements CustomerInterface{
    public Account account;
    String name = "";
    int id =0;
    String email ="";
    String password="";
    long cardNo =0;
    long phno = 0;
    String address= "";

    public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter CustomerID");
        this.id = sc.nextInt();
        System.out.println("enter Customer name");
        this.name = sc.next();
        System.out.println("enter Customer email");
        this.email = sc.next();
        System.out.println("enter Customer password");
        this.password = sc.next();
        System.out.println("enter Customer phno");
        this.phno = sc.nextLong();
        System.out.println("enter Customer cardno");
        this.cardNo = sc.nextLong();
        System.out.println("enter Customer address");
        this.address = sc.next();
        this.account = new Account().addAccount();
    }
    public void deleteCustomer(){

    }
    public void editCustomer(){

    }



}
