package com.math.set.kill;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Collection8 {
	
	
	
	public static void main(String arg[]){
		
		StudentDemo sd=new StudentDemo(1, "Altaf", 27);
		
		StudentDemo sd2=new StudentDemo(1, "Shreyas", 28);
		
		HashMap<StudentDemo,String> collHash=new HashMap<StudentDemo,String>();
		
		collHash.put(sd, "first");
		collHash.put(sd2,"Second");
		
		System.out.println(collHash.size());
		
	
		
		
		
	}

}
