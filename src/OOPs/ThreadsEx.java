package OOPs;

public class ThreadsEx {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("myThread");
//        System.out.println("After changing thread name");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName()+" thread priority is "+Thread.currentThread().getPriority());
//
//        for (int i =0;i<3;i++){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("Thread started again");

        MyThread myThread = new MyThread();
//        System.out.println(myThread.isAlive());
//        myThread.start();
//        System.out.println(myThread.isAlive());
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("is " + myThread.getName() + " thread a daemon thread: " + myThread.isDaemon());
        myThread.setDaemon(false);
        myThread.run();
        System.out.println("is " + myThread.getName() + " thread a daemon thread: " + myThread.isDaemon());

    }
}
