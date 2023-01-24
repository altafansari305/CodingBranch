package com.math.set.kill;

public class ReverseNumberWithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Altaf Ansari";
		int i=name.length();
		//char a=name.charAt(0);
		
		String reverse="";
		System.out.println("REverse the lenght "+i);
		for(int j=i-1;j>=0;j--){
			
			char c=name.charAt(j);
			reverse=reverse+c;
		}
		
		System.out.println("REverse the spring "+reverse);

	}

}
