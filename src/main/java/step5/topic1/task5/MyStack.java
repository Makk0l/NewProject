package step5.topic1.task5;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (list.size() <= 0) {
            throw new IllegalArgumentException("Список пуст");
        }
        T fistElement = list.get(0);
        list.remove(0);
        return fistElement;
    }

    public T peek() {
        T fistElement = list.get(0);
        return fistElement;
    }

    public void isEmpty() {
        System.out.println(list.isEmpty());
    }
}
