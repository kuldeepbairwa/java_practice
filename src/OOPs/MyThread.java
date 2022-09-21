package OOPs;

public class MyThread extends Thread{

    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("user thread is running");

        }
    }
}
