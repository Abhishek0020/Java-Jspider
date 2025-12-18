package Program;


public class Swapchar {
	public static void main(String[] args) {
		String s="Abhishek";

		
		if(s.length()<2) {
			System.out.println(s);
		}
		else {
			int len=s.length();
			String output=s.substring(0,len-2)+s.charAt(len-1)+s.charAt(len-2);
//			String output=s.replace('e', 'h');
//			String opString=s.replace('h', 'e');
			
			
			
			System.out.println(output);
		}	
	}
}
