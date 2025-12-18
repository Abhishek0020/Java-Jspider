package TwoPointer;

public class RemoveDup {

	public static void main(String[] args) {
		int[] nums= {1,2,2,2,3,3,4,4,5,6};
		
		int uniqe=remove(nums);
		for (int i = 0; i < uniqe; i++) {
            System.out.print(nums[i] + " ");
        }
		
//		System.out.println(result);
		
		
	}
	public static int remove(int[] nums) {
		if(nums.length==0) return 0;
		
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i] !=nums[j]) {
				i++;
				nums[i]=nums[j];
				
			}
		}
		
		return i+1;
		
	}
}
