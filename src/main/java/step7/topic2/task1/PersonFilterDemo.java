package step7.topic2.task1;

import java.util.ArrayList;
import java.util.List;

public class PersonFilterDemo {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(14, "Masha"));
        list.add(new Person(50, "Petya"));
        list.add(new Person(35, "Phedor"));

        list.stream()
                .filter(l -> l.getAge() > 30)
                .forEach(l -> System.out.println(l.getName() + " " + l.getAge()));

    }
}
