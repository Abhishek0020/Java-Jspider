package Interview_Questions;

public class Emp {
	String name;
	int id;
	int age;
	public Emp(String name,int id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
		
	}
	public String toString() {
		return "name : "+name+" age : "+age+" id : "+id;
	}
}
