package com.math.set.kill;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoClassImp implements InterFaceA,InterFaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterFaceA PL=new DemoClassImp();
		
		PL.show();
		
		InterFaceB Ib=new DemoClassImp();
		Ib.dShow();
		Ib.show_pol();
		
		InterFaceB.returnVal();
		
		
		Queue mn=new PriorityQueue<>();
		
		

	}

	@Override
	public void show() {
		System.out.println("Show Me the Interface A");
		
	}

	@Override
	public void show_pol() {
		// TODO Auto-generated method stub
		
	}

}
