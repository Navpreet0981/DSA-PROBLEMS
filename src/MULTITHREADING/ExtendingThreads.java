package MULTITHREADING;

class thread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("First Thread Started Here:- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("5" + "*" + i + ":- " + 5 * i);
                if (i == 4) {
                    System.out.println("Thread1 Is Sleeping..");
                    Thread.sleep(10000);
                    System.out.println("Thread1 Started Again");
                }
            }
            System.out.println("Thread1 Ended.");
        } catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread2 Started");
            for (int i =6; i<=10; i++){
                System.out.println("5" + "*" + i + ":- " + 5 * i);
            }
            System.out.println("Thread2 Ended.");
        }catch (Exception e){
            System.out.println("Error Occurred in t2"+e);
        }
    }
}
public class ExtendingThreads {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();

        t2.start();
    }
}
