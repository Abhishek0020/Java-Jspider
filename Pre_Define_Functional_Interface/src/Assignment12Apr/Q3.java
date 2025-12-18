package Assignment12Apr;

import java.util.function.Function;

public class Q3 {
    public static void main(String[] args) {
        Function<Integer, String>fn=num->{
        	int orgnum=num;
        	int rev=0;
        	while(num>0) {
        		int rem=num%10;
        		rev=rev*10+rem;
        		num=num/10;
        		
        	}
        	if(orgnum==rev) {
        		return orgnum+" is palindrome num : ";
        	}
        	else {
        		return orgnum+" is not palindrom num : ";
        	}
        };
        System.out.println(fn.apply(121));
        System.out.println(fn.apply(122));
    }
    
   
   
}

