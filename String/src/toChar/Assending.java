package toChar;

public class Assending {
	  public static void main(String[] args) {
	        String s = "jaaaaavva";  // Input string

	        // Convert the string into a character array
	        char[] ch = s.toCharArray();

	        // Bubble Sort algorithm to sort the character array in ascending order
	        for (int i = 0; i < ch.length - 1; i++) {
	            for (int j = 0; j < ch.length - 1 - i; j++) {
	                if (ch[j] > ch[j + 1]) {
	                	
	                    // Swap characters if they are in the wrong order\
	                	
	                    char temp = ch[j];
	                    ch[j] = ch[j + 1];
	                    ch[j + 1] = temp;
	                }
	            }
	        }

	        // Convert the sorted character array back into a string
	        String sortedString = new String(ch);

	        // Print the sorted string
	        System.out.println("Sorted string in ascending order: " + sortedString);
	    }

}
