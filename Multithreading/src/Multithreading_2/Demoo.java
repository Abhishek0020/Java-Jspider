package Multithreading_2;


class mythread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("mythread : "+i);
				
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
public class Demoo {
	public static void main(String[] args) throws InterruptedException {
		mythread t=new mythread();
		t.setDaemon(true);//NoDaemon to Daemon
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("main thraed : "+i);
			Thread.sleep(100);
			if(i==5)
				System.out.println(i/0);
		}
		
	}

}
