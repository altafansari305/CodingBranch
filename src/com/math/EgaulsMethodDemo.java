package com.math;

public class EgaulsMethodDemo {

	final public static String secretkey="1234343434";
	
	 public Object show(){
		 Integer c=new Integer(100);
		System.out.println("EgaulsMethodDemo static show method");
		return 100;
	}
	
	 public int show(int a){
		System.out.println("EgaulsMethodDemo static show method" +a);
		return 10;
	}
	
	public static void main(String[] args) {
		
		Integer a=100;
		Integer b=100;
		
		b=100;
		
		//Integer c;
		
		Integer c=new Integer(100);
		  
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a.equals(c));
		
		System.out.println(a==c);
		
		

	}

}
