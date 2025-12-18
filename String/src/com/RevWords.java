package com;

public class RevWords {
	public static void main(String[] args) {
		String s="java is easy";
		System.out.println(rev(s));
	}
	public static String rev(String s) {
	    int i = s.length() - 1;
	    int j = s.length() - 1;
	    StringBuilder res = new StringBuilder();

	    while (i >= 0) {
	        // Skip trailing spaces
	        while (i >= 0 && s.charAt(i) == ' ') i--;
	        j = i;

	        // Find the start of the word
	        while (i >= 0 && s.charAt(i) != ' ') i--;
	        int k = i + 1;

	        // Append the word
	        if (k <= j) {
	            if (res.length() > 0) res.append(' ');
	            while (k <= j) {
	                res.append(s.charAt(k));
	                k++;
	            }
	        }
	    }
	    return res.toString();
	}

}
