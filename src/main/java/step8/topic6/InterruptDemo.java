package step8.topic6;

public class InterruptDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Работаю ");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Поток завершен");
        });
        thread.start();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
