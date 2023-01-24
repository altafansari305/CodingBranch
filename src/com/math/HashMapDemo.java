package com.math;

import java.io.FileNotFoundException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "mango");
		hm.put(2, "banana");
		hm.put(1, "clover");
		
		
		try{
			
			for(Map.Entry<Integer, String> m: hm.entrySet()){
				
				System.out.println(m.getKey()+" value ="+m.getValue());
			}
		}
		
		catch(ArithmeticException |  ArrayIndexOutOfBoundsException | NullPointerException ex ){
			
		}catch(Exception e){
			
			
		}
		
		
		
		
		for(String m: hm.values()){
			
			System.out.println(m);
		}
		
		Hashtable<String, String> has=new Hashtable<>();
		
		has.put("10", "ALTAF");
		
		has.put("11", "Bindesh");
		has.put("13","clover");
		
		System.out.println(has);
		
		
		for(String a: has.values()){
			System.out.println(a);
		}
		
		for(Map.Entry<String, String> m : has.entrySet()){
			
			System.out.println(m.getKey()+" Value"+m.getValue()+" add "+m.setValue("AAA"));
		}
		
		
		
		System.out.println("Updated value+"+has);

	}

}
