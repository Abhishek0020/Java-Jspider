package obj;

public class Test1 {
	public static void main(String[] args) {
		Emp emp=new Emp(1, 24, 50000, 99999,"P*C*");
		Emp emp2=new Emp(1, 24, 50000, 99999, "p*c*");
		System.out.println(emp==emp2);
		System.out.println(emp.equals(emp2));
	}

}
