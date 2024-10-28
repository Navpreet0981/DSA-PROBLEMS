package MULTITHREADING;

//Use .wait, .notify, .notifyAll For Inter-Thread communication.
class  jacc{
    int d_amt=0;
    int w_amt;
    synchronized void withdraw(int a){
        this.w_amt = a;
        System.out.println("Trying to withdraw amt:- "+this.w_amt);
        if (d_amt < a){
            System.out.println("Insufficient balance:- "+this.d_amt);
            System.out.println("Less Balance waiting for deposit...");
            System.out.println("Enter Amount for Deposit.");

            try {
                wait();
            }catch (Exception e ){
                System.out.println("Error Occurred:- "+e);
            }
            this.d_amt -=a;
            System.out.println("Withdrawal Completed..."+"\nBalance:- "+ this.d_amt);
        }
    }
    synchronized void deposit(int a){
        System.out.println("Going To Deposit...");
        this.d_amt =a;
        System.out.println("Deposited Amount:- "+ this.d_amt);
        notifyAll();
    }
}
class WThread extends Thread{
    jacc t;
    WThread(jacc t){
        this.t = t;
    }

    @Override
    public void run() {
        t.withdraw(5000);
    }
}
class  DThread extends Thread{
    jacc t;
    DThread(jacc t){
        this.t=t;
    }

    @Override
    public void run() {
        t.deposit(15000);
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        jacc c = new jacc();
        WThread w = new WThread(c);
        DThread d = new DThread(c);
        w.start();
        d.start();

    }
}
