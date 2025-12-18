package Hahmap;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		 String str = "abhi123abhi";

	        Map<Character, Integer> freqMap = new HashMap<>();

	        for (char ch : str.toCharArray()) {
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }

	        System.out.println("Character Frequencies:");
	        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	            System.out.println("'" + entry.getKey() + "' = " + entry.getValue());
	        }
	}

}
