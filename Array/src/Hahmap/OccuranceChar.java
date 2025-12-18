package Hahmap;

import java.util.HashMap;
public class OccuranceChar {
	public static void main(String[] args) {
		String s="Abhishek";
		
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();	
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);	
		}
		System.out.println("charecter frequency : ");
		for(char key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
