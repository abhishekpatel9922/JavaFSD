package Day_10_Task1;

import java.util.Scanner;

public class UserInfor {
    String username;
    int loanAmount;
    int count = 0;
    UserInfor details[];
    Scanner sc = new Scanner(System.in);

    public void methodLoan(Branch obj1) {
        if (loanAmount < obj1.getBranchTotalFound() && obj1.getBranchTotalFound() < obj1.getBankTotalFound()) {
            System.out.println("Loan approved");
        } else {
            System.out.println("loan not approved");
        }

    }

//    public void storeData() {
//
//        UserInfor st = new UserInfor();
//        //Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter user name");
//
//        st.username = sc.next();
//
//        System.out.println("Enter loan amount");
//        st.loanAmount = sc.nextInt();
//        details[count] = st;
//
//        count++;
//    }


    public void displayMethod () {
        for (UserInfor std : details) {
            System.out.println("user name:" + std.username);
            System.out.println("loan amount:" + std.loanAmount);

        }
    }

    public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            UserInfor obj2 = new UserInfor();
            Branch obj3 = new Branch("Axis", 123, 2345677, "RBI", 34, 84774948, 1000000, 4, 9000000, 3);

            System.out.println("Enter size of array");

            int n = obj2.sc.nextInt();


            obj2.details = new UserInfor[n];
            System.out.println("enter loan Amount");

            obj2.loanAmount = sc.nextInt();
            System.out.println("Enter user name");

            obj2.username = sc.next();

            obj2.methodLoan(obj3);
            //obj2.storeData();
            obj2.displayMethod();



    }
}

