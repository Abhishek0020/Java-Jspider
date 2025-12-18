package Arr;
public class Prime {
    public static void main(String[] args) {
        int arr[] = {2,4, 6, 9, 4};
        boolean flag=false;
        
        for(int i=0;i<arr[i];i++) {
        	if(arr[i]<=1) {
        		continue;
        	}   
        boolean isPrime=true;

		for(int j=2;j<=arr[i];j++) {
        	if(arr[i]%2==0) {
        		isPrime=false;
        		break;
        	}
        }
		if(isPrime) {
			flag=true;
		break;
		}
        }
		if(flag==true)
			System.out.println("prime number present in the array : ");
		else 
			System.out.println("prime number not present in the array : ");   
    }
}
       