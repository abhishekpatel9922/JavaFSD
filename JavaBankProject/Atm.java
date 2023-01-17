package JavaBankProject;

import java.util.Scanner;

public class Atm implements ATMInterface{

    public Customer deposite(Customer customer){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your deposite amount");
        float amount = sc.nextFloat();
        customer.account.account_balance =customer.account.account_balance+amount;
        System.out.println(customer.account.account_balance);
        return customer;

    }

    public void withdraw(){

    }

    public void checkBalance(Customer customer){
        System.out.println(customer.account.account_balance);

    }
}
