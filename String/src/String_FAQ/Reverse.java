package String_FAQ;

public class Reverse {
	public static void main(String[] args) {
//		String s="ABhishek";
//		System.out.println(Reverse.revString(s));
//	}
//	public static String revString(String s) {
//		StringBuffer sBuffer=new StringBuffer(s);//Add the String to String buffer
//		sBuffer.reverse();
//		
//		return sBuffer.toString();
		
		String s="Abhishek";
//		char ch[]=string.toCharArray();
		
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
//			res+=ch[i];
			res=res+s.charAt(i);
			
		}
		System.out.println(s);
		System.out.println(res);
		
		
	}
}
