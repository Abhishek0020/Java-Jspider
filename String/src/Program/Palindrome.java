package Program;

public class Palindrome {
			public static void main(String[] args) {
				String string="nitin";
				if(palindrome(string))
					System.out.println(string+"  : is palindrome  ");
				else 
					System.out.println(string+" : is not a palindrome String ");
				
			}
			public static boolean palindrome(String string) {
				
				int i=0;
				int j=string.length()-1;
				while(i<j)
				{
					if(string.charAt(i)!=string.charAt(j))
						return false;
					i++;
					j--;
					
				}
				return true;
				
			}
}
