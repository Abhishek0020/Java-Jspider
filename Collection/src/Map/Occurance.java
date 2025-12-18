package Map;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String s="banana";
		Map<Character, String>m=new HashMap<Character, String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch)) {
				m.put(ch, i+" ");
			}
			else {
				String v=m.get(ch);
				m.put(ch, v+","+i);
			}
		}
		System.out.println(m);
		
	}

}
