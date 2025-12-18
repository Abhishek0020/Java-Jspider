package Has;



public class Employee {
	
	
	int id;
	Name n;
	void display(int id,Name n) {
		System.out.println("this is id :"+id);
		System.out.println("this name is "+n.fname+" "+n.mname+" "+n.lname);
		
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Name name=new Name("sha", "ruk", "khan");
		e.display(123, name);
		
	}

}
