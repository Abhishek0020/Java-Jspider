package number;

public class count {
	public static void main(String[] args) {
		int num=1224;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		

}
}