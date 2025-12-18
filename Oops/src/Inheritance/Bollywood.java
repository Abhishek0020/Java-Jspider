package Inheritance;

public class Bollywood extends Action {
	
	String zone="bollywood";
	void bollymovie() {
		System.out.println("bollywood movie is advantures :");
	}
	public static void main(String[] args) {
		Bollywood bollywood=new Bollywood();
		System.out.println(bollywood.userid);
		System.out.println(bollywood.pass);
		System.out.println(bollywood.zone);
		System.out.println(bollywood.Aname);
		bollywood.login();
		bollywood.bollymovie();
	}

}
