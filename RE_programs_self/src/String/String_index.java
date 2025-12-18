package String;

public class String_index {
	public static void main(String[] args) {
		String s="banana";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i%2==0) {
				System.out.println("even index is :->"+ch+" "+i);
			}
			else {
				System.out.println("odd index is :-> "+ch+" "+i);
			}
			System.out.println(ch+" "+s.indexOf(ch,i));
		}
	}

}
