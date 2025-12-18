package Matrix;

public class SumOfDiagonal {
	public static void main(String[] args) {
		int a[][]= {{1,2,1},
					{3,1,4},
					{5,7,4}
					};
		
//		sumodf doiagonal using single for loop--->
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum+=a[i][i];
				if(i!=a.length-1-i)
					sum+=a[i][a.length-1-i];
		}
			System.out.println(sum);
		
		
		//using two loop in logic -->
		
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				if((i+j==a.length-1)||(i==j))
//					sum+=a[i][j];
//			}
//		}
//		System.out.println(sum);
	}
}
