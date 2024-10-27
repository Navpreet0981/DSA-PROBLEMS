package MULTITHREADING;

public class UsingRI implements Runnable{
    public void run(){
        try {
            System.out.println("Thread started here in Try block");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println("Error Occured here"+ e);
        }
    }

    public static void main(String[] args) {
        UsingRI r1 = new UsingRI();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new UsingRI());
        System.out.println("Running without using start");
        t1.run();
        t2.run();

        System.out.println("Now using .start() method");
        t1.start();
        t2.start();
    }
}
