

package com.math.set.kill;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountDuplicatein8 {
	
	String word="ALTAFmmmmmmm";
	char [] arg=word.toCharArray();
	
	//Map<Character,Long> mapcount=word.chars().mapToObj(c -> (char)c).collect(Collector.groupingBy)
	
	 
		String str= "Communication";  
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
		
		
		//System.out.println(result); 
		
		//String str = "Monopoly";  
		//Pattern.compile(".").matcher(str).results().map(m -> m.group().toLowerCase()).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).forEach((k, v) -> System.out.println(k + " = " + v + " times"));   

}
