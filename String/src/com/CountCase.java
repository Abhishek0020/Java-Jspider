		package com;
		
		public class CountCase {
		    public static void main(String[] args) {
		
		        String string = "JavaDev@12#@*";
		        int uc = 0, lc = 0, nc = 0, sp = 0;
		        for (int i = 0; i < string.length(); i++) { // Changed condition here
		            char ch = string.charAt(i);
		            if (ch >= 'A' && ch <= 'Z') uc++;
		            else if (ch >= 'a' && ch <= 'z') lc++;
		            else if (ch >= '0' && ch <= '9') nc++;
		            else sp++;
		        }
		        
		        System.out.println("Upper case count is: " + uc);
		        System.out.println("Lower case count is: " + lc);
		        System.out.println("Number count is: " + nc);
		        System.out.println("Special character count is: " + sp);
		    }
		}
