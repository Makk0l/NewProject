package step8.topic1;

public class ThreadExtendDemo {
    public static void main(String[] args) {
        Thread thread = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");

        thread.start();
        thread2.start();
        thread3.start();

        try {
            thread.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
