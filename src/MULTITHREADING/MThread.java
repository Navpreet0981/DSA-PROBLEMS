package MULTITHREADING;

public class MThread {

    public static void main(String[] args) {
        Thread mt = Thread.currentThread();
        System.out.println("Default name of thread is:- "+ mt);
        mt.setName("Mother Thread");
        System.out.println("Thread after giving name:- "+mt);
        String name = mt.getName();
        try {
            System.out.println(name+"is started here");
            for (int i=0; i<5; i++){
                System.out.println("In thread:- "+name+" "+i);
                Thread.sleep(2000);
            }
            System.out.println("Execution is completed here for Thread:- "+name);
        }
        catch (Exception e){
            System.out.println("An Exception has been occured"+e);
        }
    }

}
