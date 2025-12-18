package TwoPointer;

public class Palindrome {
	public static void main(String[] args) {
		
		String string="MADAM";
		boolean reverse=isPalindrome(string);
		System.out.println(reverse);
		
		
	}

	public static boolean isPalindrome(String string) {
		int left=0;
		int right=string.length()-1;
		
		while(left<right) {
			if(string.charAt(left) !=string.charAt(right)) return false;
			
			left++;
			right--;
			
		}
		return true;
		
	}
}
