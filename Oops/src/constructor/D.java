package constructor;

public class D extends C 
{
	D(){
		super(10);
		System.out.println(3);
	}
	public static void main(String[] args) {
		D d=new D();
	}

}
