package Threads;

public class ThreadUsingThreadClass extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
           // System.out.println("thread using thread class");

    }
}
class threads2 extends Thread{
    public void run(){
        for (int j =0; j<50; j++){
            System.out.println("thread 2");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

