package com.math.set.kill;

public interface InterFaceB {

	void show();
	
	abstract void show_pol();
	
	default void dShow(){
		System.out.println("D Show Interface B");
		
	}
	
	static String returnVal(){
		return "return value for Static method";
	}
}
