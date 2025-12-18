package TwoPointer;

public class SwapChar {
	public static void main(String[] args) {
		String input="Abhishek";
		String output="Abhisehk";
		if(canBeEqualByOneSwap(input, output)) {
			System.out.println("The String differ by one swap");
		}
		else {
			System.out.println("The String can not be matched by one swap : ");
		}
		
	}
	public static boolean canBeEqualByOneSwap(String s1,String s2) {
		if(s1.length() !=s2.length()) return false;
		
		int first=-1;
		int second=-1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) !=s2.charAt(i)) {
				if(first==-1) {
					first=i;
				}
				else if(second==-1) {
					second=i;
				}
				else {
					return false;
				}
			}
		}
		return (second !=-1 && 
				s1.charAt(first)==s1.charAt(second)&&
				s2.charAt(second)==s1.charAt(first));
		
			
		
	}

}
