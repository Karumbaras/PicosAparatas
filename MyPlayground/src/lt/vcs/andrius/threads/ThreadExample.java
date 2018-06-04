package lt.vcs.andrius.threads;

public class ThreadExample {

    public static int skaitliukas =  0;

    public static synchronized void didink(){


        skaitliukas = skaitliukas + 1;
    }

    public static Object lock = new Object();


    public static void main(String argv[]){
        //Thread.
        // Runnable



        System.out.println("skaitliukas pries: " + skaitliukas);
        Thread thread1 = new Thread(new PlusPlusThread(1));
        Thread thread2 = new Thread(new PlusPlusThread(2));
        Thread thread3 = new Thread(new PlusPlusThread(3));
        Thread thread4 = new Thread(new PlusPlusThread(4));
        Thread thread5 = new Thread(new PlusPlusThread(5));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("skaitliukas po: " + skaitliukas);


    }
}


class PlusPlusThread implements Runnable{

    private int id;

    public PlusPlusThread(int id){
        this.id = id;
    }

    @Override
    public void run() {


        System.out.println("Starting: " + id);
        for(int i =0; i < 100;i++){


            //ThreadExample.didink();

            synchronized (new Object()){
                ThreadExample.skaitliukas = ThreadExample.skaitliukas + 1;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stopped: " + id);
    }
}
