package step8.topic5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        service.submit(()-> System.out.println("Первая задача " + Thread.currentThread().getName()));
        service.submit(()-> System.out.println("Вторая задача " + Thread.currentThread().getName()));
        service.submit(()-> System.out.println("Третья задача " + Thread.currentThread().getName()));
        service.submit(()-> System.out.println("Четвертая задача " + Thread.currentThread().getName()));
        service.submit(()-> System.out.println("Пятая задача " + Thread.currentThread().getName()));

        service.shutdown();
        try {
            if (!service.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("Не все задачи успели завершиться");
            }else {
                System.out.println("Все потоки успели завершиться");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
