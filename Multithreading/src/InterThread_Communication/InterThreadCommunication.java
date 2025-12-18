package InterThread_Communication;

//import javax.security.auth.login.AccountException;



class Account{
	int bal;
	public Account(int bal) {
		this.bal=bal;
		
	}
	public synchronized void withdraw(int ammount) {
		if(ammount>bal) {
			try {
				System.out.println(" less bal....");
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				

	
			}
		}
		bal-=ammount;
		System.out.println(ammount+" withdraw done : ");
		System.out.println(bal+" availabe bal : ");
	}
	public synchronized void deposit(int ammount) {
		System.out.println(" going to deposit...");
		
		bal+=ammount;
		notify();
		System.out.println("  Deposit Done ...");
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		Account a=new Account(5000);
		new Thread() {
			public void run() {
				a.withdraw(7000);
			}
		}.start();
		new Thread() {
			public void run() {
				a.deposit(5000);
			}
		}.start();
	}

}
