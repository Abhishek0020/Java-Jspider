	package toChar;
	
	public class OccuranceOfChar {
	    public static void main(String[] args) {
	        String s = "java is easy";
	        char[] ch = s.toCharArray();
	
	        for (int i = 0; i < ch.length; i++) {
	            int count = 1;
	            // Skip the character if it's already counted (marked as '\u0000')
	            if (ch[i] == '\u0000') continue;
	
	            // Count occurrences of the character
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                    ch[j] = '\u0000'; // Mark the character as counted
	                }
	            }
	
	            // Print the character and its occurrence count
	            if (ch[i] != '\u0000') {
	                System.out.println(ch[i] + " = " + count);
	            }
	        }
	    }
	}
