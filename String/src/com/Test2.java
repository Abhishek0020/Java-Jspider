package com;
//import java.lang.StringBuffer;
public class Test2 {
	public static void main(String[] args) {
//		String s="Ra1ma2na3";
//		s=s.replaceAll("[0-9A-Z]", "");
//		System.out.println(s);
		
//		String s=new String("abhsishek");
//		s=s.concat("pal");
//		s+="pal";
//		System.out.println(s);
//		String string="abhishek";
//		System.out.println(string.isEmpty());
//		String string="ababbbaa";
//		System.out.println(string.replace('a', 'b'));
//		System.out.println(string.substring(3,6));
//		System.out.println(string.lastIndexOf('a'));//7
//		System.out.println(string);
		
		
//		String s=new String("abhishek pal");
//		String s2=s.toUpperCase();
//		String s3=s.toLowerCase();
//		System.out.println(s==s2);//false
//		System.out.println(s==s3);//true 
//		String s1="abhishek";
//		String s2=s1.toString();
//		String s3=s1.toLowerCase();
//		String s4=s1.toUpperCase();
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1==s4);
		
//		final StringBuffer sb=new StringBuffer("abhishek");
//		sb.append("pal");
//		System.out.println(sb);
		
//		sb=new StringBuffer("varanasi");
//		System.out.println();
		
//		String string="abhshek pal";
////		int len=string.trim().length();
//		int i1=string.indexOf("a");
//		System.out.println(i1);
//		
// 		String string="Java";
//		String string2=new String("java");
//		if(string.toLowerCase().equals(string2))
//			System.out.println("equal : ");
//		else 
//			System.out.println("not equal : ");	
		
//		StringBuffer sBuffer=new StringBuffer();
//		System.out.println(sBuffer.capacity());
//		StringBuffer sBuffer=new StringBuffer("durga");
//		System.out.println(sBuffer.charAt(21));
		
		
//		StringBuffer sBuffer=new StringBuffer();
//		System.out.println(sBuffer);
//		sBuffer.ensureCapacity(1000);
//		sBuffer.append("abc");
//		System.out.println(sBuffer.capacity());
//		sBuffer.trimToSize();
//		System.out.println(sBuffer.capacity());
		
		
		
//		
		
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append("a").append("pal").reverse().insert(0, "xyz").delete(2, 3);
		System.out.println(sBuilder);
		
	}
}
