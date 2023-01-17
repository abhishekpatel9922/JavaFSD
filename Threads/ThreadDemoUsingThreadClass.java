package Threads;

public class ThreadDemoUsingThreadClass {

    public static void main(String args[]){
        ThreadUsingThreadClass t1 = new ThreadUsingThreadClass();
        System.out.println(t1.getState());
        t1.start();
        t1.setPriority(8);


        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
        t2.setPriority(5);
//       ThreadUsingThreadClass t3 = new ThreadUsingThreadClass();
        t2.start();
        //Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();
        Thread t5 = new Thread();


    }
}
