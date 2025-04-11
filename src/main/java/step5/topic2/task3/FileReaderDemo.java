package step5.topic2.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file is empty");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
