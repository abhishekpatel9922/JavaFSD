package Bank;

public class BankParent {
    String bankName;
    int bankId;
    long bankPhno;
    private int bankTotalFound;
    private float bankInt;

    public BankParent(int bankTotalFound, float bankInt){
        this.bankTotalFound = bankTotalFound;
        this.bankInt = bankInt;
    }

    public void checkLoan(int loanAmount, float branchIntr) {
        if (loanAmount < bankTotalFound) {
            System.out.println("Loan is approved");
            totalIntr(branchIntr);

        }
    }
    void totalIntr(float branchIntr) {
        System.out.println("your total intr will be : " +(branchIntr + this.bankInt));
    }
}
