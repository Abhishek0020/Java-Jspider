package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExeptionEx {
	
	public static void main(String[] args) {
		System.out.println("main start : ");
		
		try {
			FileReader fileReader=new FileReader("E:\\Resume Categories");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("handled");
			
		}
		System.out.println("main end");
		
	}

}
