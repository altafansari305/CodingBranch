package com.math.set.kill;



public class ClonableDemo implements Cloneable {

	int roll;
	String name;
	
	public ClonableDemo(int roll,String name){
		
		this.roll=roll;
		this.name=name;
	}
	
    @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) {
		ClonableDemo cl=new ClonableDemo(1, "Altaf");
		try {
			System.out.println(cl.name+ " "+cl.roll);
			ClonableDemo cl2= (ClonableDemo)cl.clone();
			System.out.println(cl2.name +" "+cl2.roll);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
