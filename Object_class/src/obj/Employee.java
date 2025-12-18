package obj;

public class Employee {
	String name;
	int age;
	int id;
	long Mobile;
	public Employee(String name, int age,int id,long Mobile) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.Mobile=Mobile;	
	}
	public String toString() {
		return name+" "+age+" "+id+" "+Mobile;
	}
	public boolean  equals(Object o) {
		Employee employee=(Employee) o;
		return this.name.equals(employee.name) && this.age==employee.age && this.id==employee.id
				&& this.Mobile==employee.Mobile;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("abhishek", 23, 1, 99999999);
		Employee e2=new Employee("abhishek", 23, 1, 99999999);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.toString());
	}

}
