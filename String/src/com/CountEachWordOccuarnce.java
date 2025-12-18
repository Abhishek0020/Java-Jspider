package com;

public class CountEachWordOccuarnce {
	 public static void main(String[] args) {
	       String s="java is programming language java is easy";
	       String words[]=s.split(" ");
	       for(int i=0;i<words.length;i++) {
	    	   int count=1;
	    	   if(words[i]!=null) {
	    		   for(int j=i+1;j<words.length;j++) {
	    			   if(words[i].equals(words[j])) {
	    				 count++;
	    				 words[j]=null;
	    			   }
	    		   }
	    		   System.out.println(words[i]+"="+count);  
		   }
	       }
	    }
}
