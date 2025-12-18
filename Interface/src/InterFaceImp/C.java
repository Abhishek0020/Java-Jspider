package InterFaceImp;

public class C implements B {
	public void add() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		B b=new C();
		b.add();
	}
	

}
