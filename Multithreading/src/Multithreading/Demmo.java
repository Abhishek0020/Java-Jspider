package Multithreading;

class t1 extends Thread{
	public void run() {
		try {
			Demmo.t2.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=1;i<=5;i++) {
			System.out.println("t1 : "+i);
		}
	}
}

class t2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("T2 : "+i);
		}
	}
}

public class Demmo {
	static t2 t2;
	public static void main(String[] args) throws InterruptedException {
		T1 t1=new T1();
		t2=new t2();
		t2.start();
		t1.join();
		for(int i=1;i<=5;i++) {
			System.out.println("main : "+i);
		}
		
		
	}

}
