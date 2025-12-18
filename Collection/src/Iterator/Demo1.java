package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("abhi");
		list.add("pal");
		list.add("GLA");
		list.add("jsp");
		
		//traversing the list through the iterator interface 
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.hasNext());
		}
	}

}
