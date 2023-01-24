package com.math;

public class MathCalculatDemo {

	public static void main(String[] args) {
		Tringle tr=new Tringle(10, 20);
		Square sq=new Square(10, 20);
		Figure f=new Figure(10, 30);
		
		
		Figure fOver;
		
		fOver =tr;
		System.out.println("Tringle value- "+fOver.area());
		
		fOver = sq;
		System.out.println("Squre value- "+fOver.area());
		
		fOver = f;
		
		System.out.println("Fingure value -"+fOver.area());
		
		InterfaceDemoService.InterfaceStaticShow();
		
		f.show();
		
		InterfaceDemoService.innerClassDemo ic=new InterfaceDemoService.innerClassDemo();
		
		ic.square();
		
		//sq.show1();
		
		Square s1=new Square(10, 20);
		s1.show1();
		
		s1.tringle();
		
		
		sq.show();
	

	}

}
