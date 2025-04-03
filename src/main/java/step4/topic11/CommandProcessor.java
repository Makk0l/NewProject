package step4.topic11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {
    private Map<String, Command> map = new HashMap<>();
    private Scanner scanner;


    public CommandProcessor() {
        mapValues();
    }

    private void mapValues() {
        map.put("pause", new PauseCommand());
        map.put("start", new StartCommand());
        map.put("stop", new StopCommand());
        scanner = new Scanner(System.in);
    }

    public void branch() {
        while (true) {
            Command command = map.get(scanner.nextLine());
            if (command != null){
                command.execute();
            }
            else {
                System.out.println("Неверная команда");
            }
        }
    }

}
