package FileOutputStram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
	public static void main(String[] args) throws IOException {
	
		
		File file=new File("C:\\\\Users\\\\rahul\\\\Desktop\\\\CSA OS\\\\B.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		String string="jspider";
		byte[] b=string.getBytes();
		if(file.canWrite())
			FileInputStream.write(b);
		else 
			System.out.println("we cant write the data : ");
		fileOutputStream.close();
		
	}

}
