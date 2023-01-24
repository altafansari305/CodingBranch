package com.math;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemoProgram extends EgaulsMethodDemo {
	
	@Override
    public String show(){
		String aa=new String("Altaf");
		System.out.println("static show method");
		return "";
	}
	
	@Override
	public int show(int a){
		System.out.println("static show method"+a);
		return 10;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nm=new ArrayList<>();
		nm.add("Altaf");
		nm.add("Ankit");
		nm.add("Amir");
		
		Iterator<String> i=nm.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	
		ArrayDemoProgram ap=new ArrayDemoProgram();
		EgaulsMethodDemo ed= new ArrayDemoProgram();
		
		ap.show();
		ap.show(10);
		
		ed.show();
		ed.show(12);

	}
	
	

}
