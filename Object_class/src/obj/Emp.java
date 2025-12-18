package obj;

public class Emp {
	int id;
	int age;
	int sal;
	long mobile;
	String mock;
	public Emp(int id,int age,int sal,long mobile,String mock) {
		this.id=id;
		this.age=age;
		this.sal=sal;
		this.mobile=mobile;
	}
	public boolean equals(Object o) {
		Emp emp=(Emp) o;
		return  this.id==emp.id && this.age==emp.age  && this.sal==emp.sal && this.mobile==emp.mobile 
			    && this.mock==emp.mock;
	}
	
	public String toString() {
		return id+" "+age+" "+mobile+" "+sal+" "+mock;
	}
	public static void main(String[] args) {
		Emp emp=new Emp(1, 24, 50000, 99999,"P*C*");
		Emp emp2=new Emp(1, 24, 50000, 99999, "p*c*");
		System.out.println(emp==emp2);
		System.out.println(emp.equals(emp2));
	}
	

}
