package Day_10_Task1;

import java.util.Scanner;

public class Branch  extends Bank {
    String branchName;
    int branchId;
    long branchPhno;
    private int branchTotalFound;
    private float branchIntr;

    public Branch(String branchName, int branchId, long branchPhno, String bankName, int bankId, long bankPhno, int branchTotalFound, float branchIntr, int bankTotalFound, float bankInt){
        super(bankName, bankTotalFound, bankPhno,bankTotalFound,bankInt);
        super.bankName = bankName;
        super.bankId = bankId;
        super.bankPhno= bankPhno;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchTotalFound = branchTotalFound;
        this.branchIntr = branchIntr;


    }

    public int getBranchTotalFound() {
        return this.branchTotalFound;
    }
}

