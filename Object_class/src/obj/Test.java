package obj;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(1, 24, 999999);
		Student s2=new Student(1, 24 ,999999);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
