package Day_9;

import java.util.Scanner;

    class Students {
    String name;
    int age;
    String place;
    String collage;
    String[] list = new String[10];
    int i = 0;
    boolean exit = true;
    Scanner sc = new Scanner(System.in);

    public void addStudent(){
        if(i<list.length){

            System.out.println("Enter the name");
            name = sc.next();
            System.out.println("Enter the age");
            age = sc.nextInt();
            System.out.println("Enter the place");
            place = sc.next();
            System.out.println("Enter the collage");
            collage = sc.next();

            list[i]= "Name: " + name.toUpperCase() +" "+"Age:" + age + " "+"Place:" +place.toUpperCase()+ " " + "Collage:" +collage.toUpperCase();
            i++;

        }
        else {
            System.out.println("No seat Available");
        }
    }
    public void displayStudents(){
        System.out.println("Enter the number of Students (0-10)");
        int e = sc.nextInt();
        System.out.println(list[e]);
    }
    public void Final(){
        while (exit){
            System.out.println("What do you want to do:- To add students press 0, To display Students press 1, To exit press 2");
            int Input = sc.nextInt();

                switch (Input){
                    case 0:
                        addStudent();
                        break;
                    case 1:
                        displayStudents();
                        break;
                    case 2:
                        exit = false;
                        break;


                }
        }
    }




}
public class Day_9_Task_1 {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.Final();
    }
}


