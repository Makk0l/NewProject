package step7.topic2.task10;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(15, "Vasya"),
                new Person(25, "Petya"), new Person(30, "Masha"), new Person(15, "Masha"));
        list.stream().sorted(Comparator.comparingInt(Person::getAge)
                .thenComparing(Comparator.comparing(Person::getName))).forEach(l -> System.out.println(l.getName() + " " + l.getAge()));
    }
}
