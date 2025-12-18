package ReadData_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\rahul\\Desktop\\CSA OS\\B.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file))
        {
            if (file.canRead()) {
                int n = fileInputStream.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = fileInputStream.read();
                }
            } else 
                System.out.print("We can't read the data: File is not readable.");
            
        } 
        
    }
}
