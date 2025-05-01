package step8.topic2;

public class RunnableLambdaDemo {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Task " + 1 + " is running");
        Runnable runnable2 = () -> System.out.println("Task " + 2 + " is running");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
