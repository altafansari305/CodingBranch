package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalKeywordExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ab=100;
		
		try{
		List<String> list=Arrays.asList("Alaf","Ankit","Clover");
			
		List st=list.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println(st);
		
		System.out.println(list.stream().count());
		
		list.stream().forEach(e ->System.out.println(e));
		
		Iterator it=list.listIterator();
	
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(100);
		arr.add(20);
		arr.add(21);
		arr.add(25);
		
		List st1=arr.stream().filter(n -> n<25).collect(Collectors.toList());
		
		System.out.println(st1);
		
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Final block----");
		}
	}

}
