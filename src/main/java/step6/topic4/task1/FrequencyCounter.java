package step6.topic4.task1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] strings = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();

        for (String s : strings){
            stringIntegerHashMap.put(s, stringIntegerHashMap.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry m : stringIntegerHashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
