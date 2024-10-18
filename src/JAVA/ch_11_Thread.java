
//CREATING THREAD BY EXTENDING THREAD CLASS

// class Mythread1 extends Thread{
//     @Override
//     public void run(){
//         int i=0;
//         while (i<40) {
//             System.out.println("My Thread1 For Cooking Is Running");
//             System.out.println("I Am Happy");
//             i++;
            
//         }
//     }
// }
// class Mythread2 extends Thread{
//     @Override
//     public void run(){
//         int i=0;
//         while (i<40) {
//             System.out.println("My Thread2 For Chatting Is Running");
//             System.out.println("I Am Sad");
//             i++;
            
//         }
//     }
// }
// public class ch_11 {
//     public static void main(String[] args) {
    //         Mythread1 t1 = new Mythread1();
    //         t1.start();

    //         Mythread2 t2 = new Mythread2();
    //         t2.start();


//     }
    
// }

//CREATING THREAD BY RUNNABLE INTERFACE

// class Mythread1Runnable implements Runnable{
//     public void run(){
//         int n = 100;
//         for(int i = 0; i <= n; i++){
//             System.out.println("I Am A Thread1 Not A Thread2");
//         }
//     }
// }
// class Mythread2Runnable implements Runnable{
//     public void run(){
//         int n = 100;
//         for(int i = 0; i <= n; i++){
//             System.out.println("I Am A Thread2 Not A Thread1");
//         }
//     }
// }
// public class ch_11 {
//     public static void main(String[] args) {
//         Mythread1Runnable b1 =new Mythread1Runnable();
//         Thread t1 = new Thread(b1);

//         Mythread2Runnable b2 =new Mythread2Runnable();
//         Thread t2 = new Thread(b2);

//         t1.start();
//         t2.start();
//     }
// }


//CONCEPT OF CONSTRUCTOR'S IN THREADING
// class Mythr1 extends Thread{
//     public Mythr1(String name){
//         super(name);

//     }public void run(){
//         int i=0;
//         while (i <= 10) {
//             System.out.println("I Am A Thread");
//             i++;
//         }
//     }
// }
// public class ch_11_Thread {
//     public static void main(String[] args) {
    //         Mythr1 t1 = new Mythr1("Navpreet");
    //         Mythr1 t2 = new Mythr1("Jaspreet");
    //         t1.start();
    //         t2.start();
    //         System.out.println("The Id Of Thread T is:- "+ t2.threadId());
    //         System.out.println("The Id Of Thread T is:- "+ t2.getName());
    //     }
    // }
    
    //CONCEPT OF PRIORITIES IN THREADING
//     class  Mythr2 extends Thread{
//         public Mythr2(String name){
//             super(name);
//         }
//         public void run(){
//             int i=0;
//             while (i <= 10) {   
//                 System.out.println("Thank You "+ this.getName());
//                 i++;
//             }
//             }
//     }
//     public class ch_11_Thread {
//         public static void main(String[] args) {
//             // Ready QUEUE: t1 t2 t3 t4 t5
//                 Mythr2 t1 = new Mythr2("Navpreet");
//                 Mythr2 t2 = new Mythr2("Jaspreet");
//                 Mythr2 t3 = new Mythr2("hashan");
//                 Mythr2 t4 = new Mythr2("harman");
//                 Mythr2 t5 = new Mythr2("jashan (Most Important)");
//                 t5.setPriority(Thread.MAX_PRIORITY);
//                 t1.setPriority(Thread.MIN_PRIORITY);
//                 t3.setPriority(Thread.MIN_PRIORITY);
//                 t2.setPriority(Thread.MIN_PRIORITY);
//                 t4.setPriority(Thread.MIN_PRIORITY);
//                 t1.start();
//                 t2.start();
//                 t3.start();
//                 t4.start();
//                 t5.start();
    
//     }
    
// }

package JAVA;
// THREAD METHODS
class Mythr3 extends Thread{
    public void run(){
        int i =0;
        while (true) {
                System.out.println("Thank You: ");
                try{
                    Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Mythr4 extends Thread{
    public void run(){
        int i =0;
        while (true) {
            System.out.println("Bye Bye!! ");
            
        }
    }
}
public class ch_11_Thread {
    public static void main(String[] args) {
        Mythr3 t1 = new Mythr3();
        Mythr4 t2 = new Mythr4();
        t1.start();
        // try{
        //     t1.join();

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
    
}