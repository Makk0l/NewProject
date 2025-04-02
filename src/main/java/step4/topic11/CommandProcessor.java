package step4.topic11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {
    private Map<String, Command> map = new HashMap<>();


    public CommandProcessor() {
        mapValues();
    }

    private void mapValues() {
        map.put("pause", new PauseCommand());
        map.put("start", new StartCommand());
        map.put("stop", new StopCommand());
    }

    public void branch() {
        while (true) {
            String result = scanner();
            Command command = map.get(result);
            if (command != null){
                command.execute();
            }
            else {
                System.out.println("Неверная команда");
            }
        }
    }

    private String scanner() {
        return new Scanner(System.in).nextLine();
    }

}
