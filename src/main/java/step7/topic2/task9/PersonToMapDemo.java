package step7.topic2.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(15,"Vasya"),
                new Person(25,"Petya"), new Person(30, "Masha"));

        Map<Integer, String> stringMap = list.stream().collect(Collectors.toMap(Person::getAge,Person::getName));
        stringMap.forEach(((integer, s) -> System.out.println(integer + " " + s)));

    }
}
