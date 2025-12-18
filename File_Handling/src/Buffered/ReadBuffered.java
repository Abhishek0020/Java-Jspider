package Buffered;

import java.io.*;

public class ReadBuffered {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
