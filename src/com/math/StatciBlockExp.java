package com.math;
 class abc{
	public abc(){
		System.out.println("constructor called");
	}
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println("first block");
	}
	{
		System.out.println("second block");
	}
}
public class StatciBlockExp extends abc {

	public static void main(String[] args) {
   abc a =new abc();
   abc a1 =new abc();
   abc a2 =new abc();
   abc a3 =new abc();
   
	}

}
