package topic3.stringComparison;

public class StringComparison {
    public static void main(String[] args) {
        String name = "Bob";
        String stringName = new String("Bob");

        System.out.println(stringName == name);
        System.out.println(stringName.equals(name));
    }
}
