
import java.util.Scanner;

class user{
    String name;
    private int userid;
    private int age;
    String place;
    String companyname;
    private String position;




    public void createUser(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please give your details");
        System.out.println("Name");
        name = scan.next();
        System.out.println("UserId");
        userid = scan.nextInt();
        System.out.println("Age");
        age = scan.nextInt();
        System.out.println("Company Name");
        companyname = scan.next();
        System.out.println("Position Name");
        position = scan.next();
        System.out.println("Place");
        place = scan.next();
    }


    public void displayUser(){
        System.out.println("Name:" +name);
        System.out.println("userid:" +userid);
        System.out.println("Age:" +age);
        System.out.println("Place:" +place);
        System.out.println("Company:" +companyname);
        System.out.println("Position:" +position);
    }

}
public class UserInfo{
    public static void main(String[] args){
        user obj1 = new user();
        obj1.createUser();
        obj1.displayUser();




    }

}


