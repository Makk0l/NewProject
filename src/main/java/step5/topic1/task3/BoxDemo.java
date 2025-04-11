package step5.topic1.task3;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Value");
        System.out.println(box.getValue());
        box.setValue("New value");
        System.out.println(box.getValue());
    }
}
