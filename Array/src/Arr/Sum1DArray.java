package Arr;

//public class Sum1DArray {
//    public static void main(String[] args) {
////        int a[] = {1, 2, 3, 4, 5};
////        int sum = 0;
//
////        for (int i = 0; i < a.length; i++) {
////            sum += a[i];
////        }
////
////        System.out.println(sum);  // Output: 15
//        
//        int  a[]= {1,2,3,4,5};
//        int evenindex=0;
//        int oddindex=0;
//        int evenValue=0;
//        int oddValue=0;
//        
//        for(int i=0;i<a.length;i++) {
//        	if(i%2==0) {
//        		evenindex+=a[i];
//        	}
//        	else {
//        		oddindex+=a[i];
//        	}
//        	if(a[i]%2==0) {
//        		evenValue+=a[i];
//        		
//        	}
//        	else {
//        		oddValue+=a[i];
//        	}
//        }
//        System.out.println("even index is : "+evenindex);
//        System.out.println("odd index is : "+oddindex);
//        System.out.println("odd value is : "+oddValue);
//        System.out.println("even value is : "+evenValue);
//    }
//}
public class Sum1DArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int evenIndexSum = 0;
        int oddIndexSum = 0;
        int evenValueSum = 0;
        int oddValueSum = 0;

        for (int i = 0; i < a.length; i++) {
            // Sum by index
            if (i % 2 == 0) {
                evenIndexSum += a[i];
            } else {
                oddIndexSum += a[i];
            }

            // Sum by value
            if (a[i] % 2 == 0) {
                evenValueSum += a[i];
            } else {
                oddValueSum += a[i];
            }
        }

        System.out.println("Sum of elements at even indexes: " + evenIndexSum);
        System.out.println("Sum of elements at odd indexes: " + oddIndexSum);
        System.out.println("Sum of even values: " + evenValueSum);
        System.out.println("Sum of odd values: " + oddValueSum);
    }
}
