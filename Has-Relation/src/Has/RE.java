package Has;

public class RE extends Bike {

	
	Engine e;
	String mn="Hunter 350";
	
	void speed() {
		System.out.println("140 km/hr");
	}
	RE(Engine e){
		this.e=e;
		
	}
	public static void main(String[] args) {
		Engine e=new Engine();
		RE re=new RE(e);
		re.speed();
		re.start();
		re.stop();
		e.work();
		
   
	
}}
