package Basic;

import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("demo.txt");
            Path destination = Paths.get("data.txt");
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

