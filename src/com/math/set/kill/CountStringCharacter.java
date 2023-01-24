package com.math.set.kill;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountStringCharacter {

	public static void main(String[] args) {
	
		String name="ANSARI ALTAFmmmmmmmm";
		char [] ar=name.toCharArray();
		 
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for (char a:ar){
		
			if(map.containsKey(a)){
				map.put(a,map.get(a)+1);
			
				//System.out.print(" map.containsKey(a) "+map.containsKey(a));
			}else{
			map.put(a,1);
			} 
			
		}
		for(Entry<Character, Integer> entry : map.entrySet()){
			
			if(entry.getValue()>=1){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
		
		System.out.println(map);
	
		
		
		
		//System.out.println(name.length());
		

	}

}
