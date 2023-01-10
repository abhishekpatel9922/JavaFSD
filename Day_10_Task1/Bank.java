package Day_10_Task1;

public class Bank {
    String bankName;
    int bankId;
    long bankPhno;
    private int bankTotalFound;
    private float bankInt;


    public Bank(String name,int id, long phno,int bankTotalFound, float bankInt) {
        this.bankName = name;
        this.bankId = id;
        this.bankPhno =phno;
        this.bankTotalFound = bankTotalFound;
        this.bankInt = bankInt;
    }

    public int getBankTotalFound() {
        return this.bankTotalFound;
    }
}
