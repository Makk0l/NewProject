package step4.topic10.task3;

public class Config {
    private static String configVersion;

    static {
        configVersion = "v1.0.0";
    }

    public static void displayConfig() {
        System.out.println(configVersion);
    }
}
