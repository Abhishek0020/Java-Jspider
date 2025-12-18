package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String string="banana";
		Map<Character, String>map=new HashMap<Character, String>();
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
			if(!map.containsKey(c))
			{
				map.put(c,i+"");
			}
			else {
				String v=map.get(c);
				map.put(c,v+","+i);
			}
		}
		System.out.println(map);
	}
}
