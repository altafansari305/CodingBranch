package com.math;

public class ReverseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="maam";
		
		String reverse="";
		char ch;
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--){
			reverse=reverse+name.charAt(i);
			
		}
		
		for(int i=0;i>name.length();i++){
			
			ch=name.charAt(i);
			//reverse=reverse+name.charAt(i);
			reverse=ch+reverse;
			
		}
		
		if(name.equals(reverse)){
			System.out.println("Palindrom");
			
		}else{
			System.out.println("not Palindrom");
		}
		
		System.out.println("Original String "+name);
		System.out.println("REverse String "+reverse);
		
		if(name.equals(reverse)){
			System.out.println("Palindrom");
		}else{
			System.out.println("not Palindrom");
		}
	}

}
