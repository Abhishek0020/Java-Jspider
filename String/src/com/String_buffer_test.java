package com;

public class String_buffer_test {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hell");
		String s=new String(sb);
		sb.append("a");
		System.out.println(sb);
	}
}
