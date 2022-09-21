package MultiThreading;

public class MultiThreadingEx {
    public static void main(String[] args) throws InterruptedException {


        MyThread thread1 = new MyThread();


        MyRunnable runnable1 = new MyRunnable();
         Thread thread2 = new Thread(runnable1);

         thread1.start();
         thread1.join();   //it will pause main thread until thread 1 die
         thread2.start();


    }
}
