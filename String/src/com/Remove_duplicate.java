package com;

public class Remove_duplicate {
	
		public static void main(String[] args) {
			String s1 = "javadev";
			String s2 = "";
			for (int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
				// Check if the character is not already in s2
				if (!s2.contains(String.valueOf(ch))) {
					s2 += ch;
				}
			}
			System.out.println(s2);
		}
	}

