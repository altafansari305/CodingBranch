package com.practice;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String name="Ansari";
		
		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		System.out.println("Reverse "+sb.reverse());
		
		String reverse="";
		
		int i=name.length();
		
		for(int j=i-1;j<i;j++){
			char c=name.charAt(j);
			System.out.println(name.charAt(j));
			reverse=reverse+c;
		}

		System.out.println(reverse);
	}

}
