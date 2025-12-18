package Multithreading_1;

//import java.beans.IntrospectionException;

class T1 extends Thread{
	public void run() {
		try {
			Test.t2.join();;
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=1;i<=5;i++) {
			System.out.println("T1 : "+i);
		}
		
	}
}
class T2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("T2 : "+i);
		}
	}
}


public class Test {

	public static T2 t2;
	public static void main(String[] args) throws InterruptedException {
		
		T1 t1=new T1();
		t2=new T2();
		t1.start();
		t2.start();
		t1.join();
		for(int i=1;i<=5;i++) {
			System.out.println("main "+i);
		}
		
	}

}
