package step8.topic3;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();


        Runnable runnable1 = () -> {
            counter.increment();
            System.out.println(counter.getCount());
        };
        Runnable runnable2 = () -> {
            counter.increment();
            System.out.println(counter.getCount());
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
