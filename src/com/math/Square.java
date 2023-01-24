package com.math;

public class Square extends Figure implements InterfaceDemoService {

	int a, b;
	public Square(int a,int b){
		super(a,b);
		this.a=a;
		this.b=b;
		
	}
	
	double area(){
		
		System.out.println("Area of the Square - " +(a*a*b));
		return (a*a*b);
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

	

}
