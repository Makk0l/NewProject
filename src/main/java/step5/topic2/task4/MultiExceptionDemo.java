package step5.topic2.task4;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Integer numb = null;
        try {
            System.out.println(array[5]);
            System.out.println(numb.intValue());
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
