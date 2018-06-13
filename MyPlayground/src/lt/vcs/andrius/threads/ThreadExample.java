package lt.vcs.andrius.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample {

    //public static int counter = 0;
    //public static AtomicInteger counter2 = new AtomicInteger();

    public static Object lock = new Object();


    public static void main(String argv[]) {

        System.out.println("Starting:" + Thread.currentThread().getName());

        Counter c = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new MyThread(c)).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value:" + c.counter);

    }
}


class MyThread implements Runnable {
    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment2();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}


class Counter {
    public int counter;
    public synchronized void increment(){
        counter++;
    }

    public void increment2(){
        synchronized (this) {
            counter++;
        }
        //
    }


}



