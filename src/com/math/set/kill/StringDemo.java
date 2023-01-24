package com.math.set.kill;

public class StringDemo extends Thread {
	
	public void m1(String s1){
		System.out.println("String method invoked..");
	}
	
	public void m1(Object s1){
		System.out.println("Object method invoked..");
	}
	
	public void run(){
		System.out.println("Thead Start from Thread class");
	}
	
	public static void main(String args[]){
		
		StringDemo st=new StringDemo();
		
		for(int i=0;i<10;i++){
			System.out.println("Documents "+i);
		}
		
		st.start();
		st.m1(null);
	}
	

}
