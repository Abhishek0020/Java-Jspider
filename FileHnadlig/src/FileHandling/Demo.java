package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\rahul\\Desktop\\CSA OS\\A.txt");
		//System.out.println(f.mkdir());
//		System.out.println(f.createNewFile());
//		System.out.println(f.canExecute());
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		System.out.println(f.getAbsolutePath());
		File f1=new File("C:\\\\Users\\\\rahul\\\\Desktop\\\\CSA OS\\\\B.txt");
		System.out.println(f.renameTo(f1));
	}

}
