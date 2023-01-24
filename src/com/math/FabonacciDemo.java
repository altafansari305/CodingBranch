package com.math;

public class FabonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1,n1=2,n2;
		int count=10;
		
		System.out.println("Fabonacci seriels serieze");
		System.out.print(n+" "+n1);
		for(int i =2;i<10;i++){
			n2=n+n1;
			System.out.print(" "+n2);
			n=n1;
			n1=n2;
		}
		

	}

}
