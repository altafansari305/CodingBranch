package com.math;

public class Tringle extends Figure {

	int a, b;
	Tringle(int a,int b){
		
		super(a,b);
		this.a=a;
		this.b=b;
		
	}
	
	public Tringle(){
		System.out.println("no para constructor of the Tringle - ");
	}
	
	double area(){
		
		System.out.println("Area of the Tringle - " +(a*a));
		
		return (a*a);
	}
	
}
