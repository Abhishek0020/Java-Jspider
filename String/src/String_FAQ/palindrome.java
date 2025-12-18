package String_FAQ;

public class palindrome {
	public static void main(String[] args) {
		 String s = "nitin";
	        String reString = "";  // Initialize reString as an empty string
	        // Reverse the string
	        for (int i = s.length() - 1; i >= 0; i--) {
	            reString += s.charAt(i);
	        }
	        // Check if the original string is equal to the reversed string
	        if (s.equals(reString)) {
	            System.out.println(reString + " :is palindrome");
	        } else {
	            System.out.println(reString + " is not palindrome");
	        }
	}
}
