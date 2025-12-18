package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(10,11,1,2,3,4,5,6,7,8,9);
	l.stream().filter(i->i%2==0).forEach(i->System.out.println(i));//print even digit only
	
	
	
	long a=l.stream().filter(i->i%2!=0).count();
	
	System.out.println("=================");
	System.out.println(a);//count odd number 
	System.out.println("===============");
	List<Integer>res=l.stream().sorted().toList();
	System.out.println(res);//sorted the elements
	
	
	
}
}
