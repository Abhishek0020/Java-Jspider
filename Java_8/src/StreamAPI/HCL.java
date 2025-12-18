package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class HCL {
	public static void main(String[] args) {
		Emp e1=new Emp("abhi", 25, 'm');
		Emp e2=new Emp("radha", 20, 'f');
		Emp e3=new Emp("suhani", 24, 'f');
		Emp e4=new Emp("sakshi", 23, 'f');
		Emp e5=new Emp("raj", 20, 'm');
		Emp[] e= {e1,e2,e3,e4,e5};
		List<Emp>l=Arrays.asList(e);
		Long f=l.stream().filter(i->i.gender=='f').count();
		System.out.println("female count "+f);
		System.out.println("male count : "+(e.length-f));
	}
}
