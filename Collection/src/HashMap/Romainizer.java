package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Romainizer {
	public static void main(String[] args) {
		int num=1225;
		System.out.println(convert(num));
	}
	public static String convert(int n) {
		String res="";
		Map<Integer, String>map=new LinkedHashMap<Integer, String>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9,"IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
		int num[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int value:num) {
			while(n>=value) {
				res+=map.get(value);
				n-=value;
				
			}
		}
		return res;
	}

}
