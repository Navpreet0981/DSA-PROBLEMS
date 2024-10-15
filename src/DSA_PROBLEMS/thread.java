package DSA_PROBLEMS;

public class thread extends  Thread{

    public void run(){
        for (int i=0 ; i<=10; i++){
            System.out.println("Run");
        }
    }

    public static void main(String[] args) {
        thread t1 = new thread();
        t1.start();
        
    }
}
