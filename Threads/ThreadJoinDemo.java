package Threads;

public class ThreadJoinDemo {
    public static void main(String args[]){
        Thread_join t1 = new Thread_join();
        Thread_join t2 = new Thread_join();
        Thread_join t3 = new Thread_join();
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();


        try {
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

        try {
            t2.join();

        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        t3.start();

    }
}
