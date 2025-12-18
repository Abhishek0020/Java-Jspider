package Basic;

import java.io.File;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("xxx.txt");
		
	    if(file.createNewFile()) {
	    	System.out.println("file created : ");
	    }
	    else {
			System.out.println("not created : ");
		}
	    
	    
	    
	    
	}

}
