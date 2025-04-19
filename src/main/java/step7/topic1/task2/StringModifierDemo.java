package step7.topic1.task2;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier stringModifier = (s -> s.toUpperCase().concat("!"));
        System.out.println(stringModifier.modify("Hi"));
    }
}
