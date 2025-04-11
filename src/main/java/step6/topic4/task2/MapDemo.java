package step6.topic4.task2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 72);
        map.put("Charlie", 90);
        map.put("Diana", 68);

        for (Map.Entry m : map.entrySet()){

            if ((int) m.getValue() >= 75){
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}
