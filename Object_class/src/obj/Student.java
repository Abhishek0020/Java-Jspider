package obj;

public class Student {

	int id;
	int age;
	long Mobile;
	
	public Student(int id,int age,long Mobile) {
		this.id=id;
		this.age=age;
		this.Mobile=Mobile;
		
	}
public boolean equals(Object O) {
	
	Student student=(Student) O;
	return this.id==student.id && this.age==student.age && this.Mobile==student.Mobile;
	
	
}
}
