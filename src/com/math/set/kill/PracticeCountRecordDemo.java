package com.math.set.kill;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeCountRecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="ALTAF ANSARImmmmmmm";
		
		char arg[]=word.toCharArray();
		
		int count=0;
		
		Map<Character,Integer> mapEntry=new HashMap<>();
		
		for (char c:arg){
			
			if(mapEntry.containsKey(c)){
				mapEntry.put(c, mapEntry.get(c)+1);
				
			}else{
				mapEntry.put(c, 1);
			}
			
			
			
		}
		System.out.println("for loop"+mapEntry);
		
		for(Entry<Character, Integer> mapkey : mapEntry.entrySet()){
			
			System.out.println(mapkey.getKey()+" count time "+mapkey.getValue());
			
		}
		

	}

}
