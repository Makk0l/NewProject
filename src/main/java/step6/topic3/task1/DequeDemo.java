package step6.topic3.task1;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Удаление " + list.pollFirst());
        System.out.println("Удаление " + list.pollLast());

        for (Integer number : list){
            System.out.println(number);
        }
    }
}
