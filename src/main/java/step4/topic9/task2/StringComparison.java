package step4.topic9.task2;

public class StringComparison {
    public static void main(String[] args) {
        String str = "Super man";
        String string = new String("Super man");

        System.out.println(str == string);
        System.out.println(string.equals(str));
    }
}
