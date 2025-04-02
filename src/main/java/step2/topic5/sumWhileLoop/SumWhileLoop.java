package step2.topic5.sumWhileLoop;

public class SumWhileLoop {
    public static void main(String[] args) {
        int n = 500;
        int value = 0;
        int i = 1;

        while (value <= n){
            value += i;
            i++;
        }
        System.out.println(value + " " + i);
    }
}
