package step8.topic9;

public class RaceConditionDemo {
    static int count = 0;

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
