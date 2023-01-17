package JavaBankProject;

public interface ATMInterface {

    Customer deposite(Customer customer);

    void withdraw();

    void checkBalance(Customer customer);
}
