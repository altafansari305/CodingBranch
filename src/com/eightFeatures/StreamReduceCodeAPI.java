package com.eightFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceCodeAPI {

	public static void main(String[] args) {
	
		List<Integer> number=Arrays.asList(23,21,2,44,54,4);
		
		
		//with out stream Api / normal program
		List<Integer> evenlist=new ArrayList<Integer>();
		
		for(Integer i : number){
			
			if(i%2==0){
				evenlist.add(i);
				
			}
		}
		System.out.println("Al the list"+number);
		System.out.println("Even List "+evenlist);
		

		//using stream 
		
	 List list1=number.stream().filter(n -> n%2==0).collect(Collectors.toList());
	
	System.out.println("After Stream API "+list1);
	
	System.out.println(
	number.stream().filter(n -> n>=30).collect(Collectors.toList()));
		
		
	}

}
