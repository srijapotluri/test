package sample;

import java.util.*;

public class CountNoOfChars {
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Srija Potluri";
		char c []=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(char ch:c) {	
			if(m.containsKey(ch))
				m.put(ch, m.get(ch)+1);
			else
				m.put(ch, 1);
		}
		
		Set<Character> cha=m.keySet();
		
		for(char key:cha)
			System.out.println("alaphabet:::::::::"+key+" count of chars:::::::::"+m.get(key));
			
	}

}
