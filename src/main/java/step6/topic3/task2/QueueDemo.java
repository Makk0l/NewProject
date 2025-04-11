package step6.topic3.task2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList();
        list.offer("A");
        list.offer("B");
        list.offer("C");
        System.out.println("Первый элемент " + list.peek());

        while (list.size()!= 0){
            System.out.println(list.poll());
        }
    }
}
