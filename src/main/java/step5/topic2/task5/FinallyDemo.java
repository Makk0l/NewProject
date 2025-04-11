package step5.topic2.task5;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Ресурс открыт");
        try {
            int result = 10 / 0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Ресурс закрыт");
        }

    }
}
