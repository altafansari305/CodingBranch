package com.math;

public interface InterfaceDemoService {
	
	int a=10;

	 static void InterfaceStaticShow(){
		 
		 System.out.println(" STATIC VOID");
	}
	 void show2();
	
   default void show1() {
	   System.out.println(" default method show1");
   }
   
 
   class innerClassDemo{
	   
	   int a;
	   void square(){
		   System.out.println(" Square ---");
	   }
   }
	
}
