package Hahmap;

import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4};
		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		System.out.println("frequency count : ");
		for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
	}

}
