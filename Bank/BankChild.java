package Bank;

import java.util.Scanner;

public class BankChild  extends  BankParent{
    String branchName;
    int branchId;
    long branchPhno;
    private long branchTotalFound;
    private float branchIntr;

    BankChild(String branchName, int branchId, long branchPhno, String bankName, int bankId, long bankPhno, long branchTotalFound, float branchIntr, int bankTotalFound, float bankInt){
        super(bankTotalFound, bankInt);
        super.bankName = bankName;
        super.bankId = bankId;
        super.bankPhno= bankPhno;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchTotalFound = branchTotalFound;
        this.branchIntr = branchIntr;

    }

    public static void main(String args[]){
        BankChild Axis = new BankChild("Axis", 1, 1234567, "RBI", 6, 97800000, 200000,7, 9000000, 3);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter loan amount");
        int loan = sc.nextInt();
        Axis.checkLoan(loan, Axis.branchIntr);
    }

}
