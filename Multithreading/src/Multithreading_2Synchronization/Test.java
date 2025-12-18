package Multithreading_2Synchronization;


class A{
	public synchronized void m1(String s) {
		for(int i=1;i<=5;i++) {
			System.out.println("M1() is executed by : "+s);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
class Th extends Thread{
	A a;
	String s;
	public Th(A a, String s) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.s=s;
	}
	
	public void run() {
		a.m1(s);
		
	}
}

public class Test {
public static void main(String[] args) {
	A a=new A();
	Th t1=new Th(a,"t1");
	Th t2=new Th(a,"t2");
	t1.start();
	t2.start();
	
}
}
