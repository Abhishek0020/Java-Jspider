package Interview_Questions;


@FunctionalInterface
interface I{
	
	int add(int a,int b);
}
public class Addition {
	public static void main(String[] args) {
		
	I i=(a,b)->a+b;
	
	int res=i.add(2, 3);
	System.out.println("sum is : "+res);
	
	}
}
