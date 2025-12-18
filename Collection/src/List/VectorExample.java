package List;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("ram");
		v.add('a');
		v.add(3.5);
		System.out.println(v);
		System.out.println(v.get(0));//10
		System.out.println(v.isEmpty());//false
		
		
	}
}
