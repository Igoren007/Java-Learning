package javamultithreading.one;

public class thread1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread " + i);
        }
    }
}
