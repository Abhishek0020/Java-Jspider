package understanding;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("writ.txt");
			writer.write("this is Abhishek ");
			writer.close();
			System.out.println("file written successfully : ");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occured ....");
			e.printStackTrace();
		}
		
		
	}

}
