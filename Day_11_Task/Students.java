package Day_11_Task;

import java.util.HashMap;

class Students {
    String name;
    int rollno;
    String collage;
    String place;
    String branch;
    int sem;

    public Students(String name, String collage, String place, String branch, int rollno, int sem){
        this.name = name;
        this.collage = collage;
        this.place = place;
        this.branch = branch;
        this.sem = sem;
        this.rollno = rollno;
    }


    class helper{
        HashMap<Integer, Students> map = new HashMap<>();//store all student object inside this map

    }
}
