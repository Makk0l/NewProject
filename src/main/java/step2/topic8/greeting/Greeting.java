package step2.topic8.greeting;

public class Greeting {
    public static void main(String[] args) {
        String name = getGreeting("Майкл");
        System.out.println(name);
    }
    public static String getGreeting(String name){
        return "Привет " + name;
    }
}
