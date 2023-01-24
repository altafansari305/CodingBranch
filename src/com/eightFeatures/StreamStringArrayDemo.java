package com.eightFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.standard.MediaSize.Other;

public class StreamStringArrayDemo {

	public static void main(String[] args) {
		
		
		String name[]={"Altaf","Ankit","Bindesh","Vijay"};
		
		
		for(String e :name){
			System.out.println(e);
		}
		System.out.println("Using Stream API in String Object ");
		
		//2 way
		Stream<String> nameList=Stream.of(name);		
		nameList.forEach(e -> {
			System.out.println(e);
		});
		
		// 3 list ,set object
		
		List<Integer> age=new ArrayList<>();
		
		age.add(12);
		age.add(18);
		age.add(22);
		age.add(20);
		age.add(33);
		
		age.stream().forEach(m-> {
			System.out.println(m);
		});
		
		System.out.println(age.stream().count());
		//Stream valueAge-age.stream().findAny();
		
		
		List<String> names=Arrays.asList("Altaf","Anasari","clover","Ankit");
	 
		List<String> namesWithFilter= names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(namesWithFilter);
		
		//Map emthod
		//Square the number
		
		System.out.println(age.stream().map(i -> i*i).collect(Collectors.toList()));
		
		//for each loop
		age.stream().forEach(System.out::println);
		
		//Sort
		age.stream().sorted().forEach(System.out::println);
		
		
		
		
		
		
		
		
		

	}

}
