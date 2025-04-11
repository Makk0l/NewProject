package step6.topic2.task1;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Apple");
        for (String string : hashSet){
            System.out.println(string);
        }
    }
}
