package MULTITHREADING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class First extends Thread {
    private volatile boolean suspended = false;
    private volatile boolean stopped = false;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (this) {
                while (suspended) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted: " + e);
                    }
                }
                if (stopped) {
                    System.out.println("Thread has been stopped.");
                    break;
                }
            }
            if (i == 5) {
                try {
                    System.out.println("Thread is sleeping for 5 seconds...");
                    Thread.sleep(5000);
                    System.out.println("Thread woke up...");
                } catch (InterruptedException e) {
                    System.out.println("Exception occurred: " + e);
                }
            }
            System.out.println(i + " * 4 = " + i * 4);
        }
        System.out.println("Thread finished.");
    }

    public void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    public void stopThread() {
        stopped = true;
        synchronized (this) {
            notify(); // In case thread is waiting, it will be able to exit
        }
    }
}

public class ThreadControl {
    public static void main(String[] args) throws IOException {
        First ft = new First();
        ft.start();

        System.out.println("Thread is suspended...");
        ft.suspendThread();

        System.out.println("To resume, enter 1. To stop, enter any other digit:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ch = br.readLine();
        int c = Integer.parseInt(ch);

        if (c == 1) {
            System.out.println("Thread resumed from suspended state...");
            ft.resumeThread();
        } else {
            System.out.println("Thread stopped and will not resume again because you entered: " + c);
            ft.stopThread();
        }
    }
}
