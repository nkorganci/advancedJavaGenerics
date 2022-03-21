package multiThreading;

public class MT02MethodLevelSynchronization {
    //Instance variable will be used by both thread
    public static int counter=0;

    public static void main(String[] args) throws InterruptedException {

        //Thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count("Thread 1 ");
            }
        });

        //Thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count("Thread 2 ");
            }
        });

        thread1.start();
        // thread1.join(); // Multithread devre disi kaliyor
        thread2.start();

    }
}

class Counter{

    //Count class, synchronized is used for method level
    synchronized public static void count(String str){
        for (int i = 0; i <10; i++) {
            MT02MethodLevelSynchronization.counter++;
            System.out.println("Counter " + str + MT02MethodLevelSynchronization.counter);

        }
    }
    public static void x(){

    }
}
