package step5.topic1.task3;

public class Box<T> {
    private T value;

    public Box() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
