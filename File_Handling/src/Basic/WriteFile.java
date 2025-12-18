package Basic;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello Abhishek!\nWelcome to Java file handling.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

