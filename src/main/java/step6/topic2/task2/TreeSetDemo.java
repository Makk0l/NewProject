package step6.topic2.task2;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);

        for (Integer t : treeSet){
            System.out.println(t);
        }
    }
}
