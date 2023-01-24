package com.eightFeatures;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StreamsAPIDemo {

	public static void main(String[] args) {
		
		System.out.println("MAIN =");
		
		/*List<Integer> aslist=new ArrayList<Integer>();
		
		List<Integer> list=Arrays.asList(121,124,112,114,222);
		aslist.add(101);
		
		Iterator<Integer> asprin=list.iterator();
		
		
		while(asprin.hasNext()){
			System.out.println(asprin.next());
			if(asprin.next()==112){
				
			}
			 
		}*/
		
		 List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
	        long count = strList.stream()
	                            .filter(x -> x.isEmpty())
	                            .count();
	        System.out.printf("List %s has %d empty strings %n", strList, count);
	        
	        long num = strList.stream()
                    .filter(x -> x.length()> 3)
                    .count();
 System.out.printf("List %s has %d strings of length more than 3 %n", 
                     strList, num);
	 
		/*System.out.println(asprin.hasNext());
		System.out.println(asprin.next());*/
		
		
		
		
		
		
		
		
		
		
	}

}
