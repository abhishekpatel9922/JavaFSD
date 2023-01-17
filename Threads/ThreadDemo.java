package Threads;

public class ThreadDemo {
    public static void main(String args[]){
        ThreadUsingThreadClass obj = new ThreadUsingThreadClass();
        threads2 obj2 = new threads2();
        obj.start();
        obj2.start();
        obj.setPriority(10);
        obj2.setPriority(5);


        //Thread t1 = new Thread(obj);
        System.out.println(obj.getState());
        System.out.println(obj2.getState());


        //t1.start();
        //System.out.println(t1.getState());
       // System.out.println(t1);

    }
}
