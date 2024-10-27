package MULTITHREADING;

class th1 implements Runnable{
    public void run(){
        try{
            System.out.println("First Thread Started here:- ");
            for (int i=1; i<=6; i++) {
                System.out.println("Area Of circle of Radius: "+i+"is:- "+ 3.14*(i*i));
                if (i == 4) {
                    System.out.println("First Thread Is Now Sleeping For 10 seconds");
                    Thread.sleep(10000);
                    System.out.println("First Thread Is Resumes here");
                }
            }
            System.out.println("First thread Ended Here");
        }
        catch (Exception e){
            System.out.println("Error Occurred Here"+e);
        }
    }
}
class th2 implements Runnable{
    public void run() {
        try{
            System.out.println("Second thread started here:- ");
            for (int i=1; i<=5; i++){
                System.out.println("Square Of: "+i+"is:- "+(i*i));
            }
            System.out.println("Second Thread Ended");
        }
        catch (Exception e){
            System.out.println("Error occurred in th2:- "+e);
        }
    }
}
public class AreaUsingThreads {
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();

        Thread mt1 = new Thread(t1);
        Thread mt2 = new Thread(t2);
        mt1.start();
        mt2.start();
    }
}
