package Basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\rahul\\Desktop\\Abc\\a.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(f);
		String string="abhishek";
		
		byte[] b=string.getBytes();
		if(f.canWrite())
			fileOutputStream.write(b);
		else 
			System.out.println("we cant write the data : ");
		fileOutputStream.close();
		
	}

}
