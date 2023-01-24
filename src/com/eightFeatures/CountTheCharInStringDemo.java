package com.eightFeatures;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharInStringDemo {
	
	public static void main(String[] args) {
		String name="JAVAEEMODE JAVADD";
		
		int lenght=name.length();
		
		Map<Character,Integer> listmap=new HashMap<>();
		int count=1;
		for(int i=1;i<lenght;i++){
			
			char c=name.charAt(i);
			
			if(listmap.containsKey(c)){
				count++;
				listmap.put(c, listmap.get(c)+1);
			}else{
				listmap.put(c, 1);
			}
			
			
		}
		System.out.println("Unique Character on the String"+listmap);
		
	}

}
