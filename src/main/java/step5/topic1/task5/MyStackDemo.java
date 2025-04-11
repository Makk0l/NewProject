package step5.topic1.task5;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.isEmpty();
        System.out.println(stack.pop());
    }
}
