package com.math;

public class Figure extends AbstractFigure  {
	
	int a,b;
	
	public Figure(int a,int b) {
		
		a=a;
		b=b;
		// TODO Auto-generated constructor stub
	}
	Figure(){
		
	}
	
	double area(){
		System.out.println("area of figure class -"+ (a+b));
		return 0;
	}


	@Override
	void show() {
	   System.out.println(" Figure class show method =-");
		
	}

}
