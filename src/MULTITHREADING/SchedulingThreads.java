package MULTITHREADING;

class MT extends Thread{
    @Override
    public void run() {
            System.out.println("Thread1 started for multipication of table");
            for (int i=1; i<=10; i++){
                System.out.println("6"+ " * "+i+": "+i*6);
            }
    }
}
class FIB extends Thread{
    @Override
    public void run() {
        System.out.println("Thread2 For Fibbonacci Series Started");
        int f=0, s=1, t,i,max =10;
        System.out.println(f+"\n" + s);
        for (i=2; i<max;i++){
            t = f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}
public class SchedulingThreads {
    public static void main(String[] args) {
        MT m =new MT();
        m.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of t1:- "+ m.getPriority());
        m.start();

        FIB fb= new FIB();
        fb.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of t2:- "+fb.getPriority());
        fb.start();

    }
}
