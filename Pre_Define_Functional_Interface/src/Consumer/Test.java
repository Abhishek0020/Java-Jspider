package Consumer;

import java.util.function.Consumer;
//only consume the data and not return any type
public class Test {
	public static void main(String[] args) {
		Consumer<String>cs=i->System.out.println("the name is "+i);
		cs.accept("king");
		cs.accept("RCB");
		cs.accept("zero");
	}

}