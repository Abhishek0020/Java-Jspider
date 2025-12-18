package Com.comparableInterface;

import java.util.Arrays;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e1=new Emp("Amar", 24, 1);
		Emp e2=new Emp("Vinay", 21, 3);
		Emp e3=new Emp("Bunny", 19, 4);
		Emp e4=new Emp("tarak", 30, 5);
		Emp e5=new Emp("chay", 16, 2);
		Emp[] e= {e1,e2,e3,e4,e5};
		Arrays.sort(e);
		for(Emp emp:e) {
			System.out.println(emp);	
		}
		
	}

}
