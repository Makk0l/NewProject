package step6.topic1.task2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.addFirst("Fist element");
        list.addLast("Last element");
        System.out.println("Вывод элементов до удаления ");
        for (String string : list) {
            System.out.println(string);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println("Вывод элементов после удаления ");
        for (String string : list) {
            System.out.println(string);
        }
    }
}
