package Has;

public class BMW extends Bike  {
	
	Engine engine;
	String mn="husqwarna 401 ";
	void speed() {
		System.out.println("speed i s 100km/h ");
	}
	public BMW(Engine engine) {
		this.engine=engine;
		
		
	}
	public static void main(String[] args) {
		Engine engine=new Engine();
		BMW bmw=new BMW(engine);
		bmw.speed();
		bmw.start();
		bmw.stop();
		engine.work();
		
	}

}
