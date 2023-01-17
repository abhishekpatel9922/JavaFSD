package JavaBankProject;

import java.util.Date;

public interface TransactionInterface {
    int transactionId = 0;
    Date transactionDate = new Date();
    String transactionType = "";
    float transactionAmount = 0;
    float currentBalance = 0;

    void addTransaction();




}
