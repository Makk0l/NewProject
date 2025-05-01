package step8.topic4;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        final int limit = 5;
        List<Integer> buffer = new ArrayList<>();

        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == limit) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer.add(value);
                    System.out.println("Добавили " + value);
                    value++;
                    buffer.notifyAll();
                }
            }
        });
        Thread consumer = new Thread(()->{
            while (true){
                synchronized (buffer){
                    while (buffer.isEmpty()){
                        try {
                            buffer.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }

                    }
                    int value = buffer.remove(0);
                    System.out.println("Удаляем " + value);
                    buffer.notifyAll();
                }
            }
        });
        producer.start();
        consumer.start();

    }
}
