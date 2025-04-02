package step4.topic11;

public class StrategyCommandDemo {
    public static void main(String[] args) {
        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.branch();
    }
}
