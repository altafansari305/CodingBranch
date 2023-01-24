package com.math.set.kill;

import java.util.Scanner;

public class UserReverseProgram {

	public static void main(String[] args) {
		
	 String name;
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter a String value");
	 name=sc.nextLine();
	 System.out.println("Enter a number ");
	int  number=sc.nextInt();
	 
	 System.out.println("You enter this value "+name);
	
	 int len=name.length();
	 String reverse="";
	 
	 for(int i=len-1;i>=0;i--){
		 
		char ch = name.charAt(i);
		 reverse=reverse+ch;
	 }
	
	 StringBuffer buffer=new StringBuffer();
	 
	
	 System.out.println("String buffer "+ buffer.reverse());
	 
	 if(name.equals(reverse)){
		 System.out.println("palindrom number");
	 }else{
		 System.out.println("not palindrom number");
	 }
	 
	 System.out.println("Reverse String value "+ reverse);
	}

}
