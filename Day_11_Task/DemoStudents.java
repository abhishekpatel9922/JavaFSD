package Day_11_Task;


import java.util.ArrayList;
class DemoStudents {
    int n = 4;

    class Data {
        int roll;
        String name;
        int marks;
        long phno;

        Data(int roll, String name, int marks, long phno) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phno = phno;
        }
    }

//    public void addValues(int roll[], String name[], int marks[], long phno[]) {
//        ArrayList<Data> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(new Data(roll[i], name[i], marks[i], phno[i]));
//        }
//    }


    public static void main(String args[]) {
        int roll[] = {1, 2, 3, 4};
        String name[] = {"Abhi", "Subh", "amit", "Atul"};
        int marks[] = {100, 200, 300, 400};
        long phno[] = {1456789, 5678975, 34567895, 46787654};

        DemoStudents obj = new DemoStudents();
        obj.addValues(roll, name, marks, phno);

    }

    public void addValues(int roll[], String name[], int marks[], long phno[]) {
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Data(roll[i], name[i], marks[i], phno[i]));

        }
        printValues(list);
    }


    public void printValues(ArrayList<Data> list) {
        for (int i = 0; i < n; i++) {
            Data data = list.get(i);
            System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phno);
        }

    }




}
