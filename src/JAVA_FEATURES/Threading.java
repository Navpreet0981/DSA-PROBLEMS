package JAVA_FEATURES;

import java.sql.SQLOutput;

public class Threading{
    public static void main(String[] args) {
        Counter obj = new Counter();
        Thread t1 = new Thread(() -> {
           for(int i = 0; i < 100; i++){
               obj.inc();
           }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                obj.inc();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Counter:- " + obj.get() +" " + obj.getClass());
    }
}

class Counter{
    int count = 0;
    public synchronized void inc(){
        count++;
    }
    public synchronized int get(){
        return count;
    }
}
