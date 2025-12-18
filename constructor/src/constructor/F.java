package constructor;

public class F extends E
{

	
	int x=20;
	void add() {
		int x=30;
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(x);
	
	}
	public static void main(String[] args) {
		B b=new B();
		b.add();
	}
}
