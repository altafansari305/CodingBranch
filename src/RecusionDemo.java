
public class RecusionDemo extends InheritanceDemo {
	
	void childShow(){
		
		System.out.println(" child show .."+ (a+b));
		
	}
	
	void show(){
		
		System.out.println(" child show .."+ (a+b));
		
	}
	
	void show1(){
		System.out.println("Show 1 a plus b value - "+ (a+b));
		
	}
	

	public static void main(String[] args) {
		FactorialDemo fd=new FactorialDemo();
		
		System.out.println(" FACT 4 "+fd.fact(4));
		System.out.println(" FACT 5 "+fd.fact(5));
		System.out.println(" FACT 6 "+fd.fact(6));
		
		
		InnerClassDemo in=new InnerClassDemo();
		
		InnerClassDemo in1=new InnerClassDemo();
		
		
		RecusionDemo rs=new RecusionDemo();
		InheritanceDemo id=new InheritanceDemo();
		
		InheritanceDemo parentOBJ =new RecusionDemo();
		
		
		
		rs.a=10;
		rs.b=20;
		rs.show();
		id.show();
		
		parentOBJ.show();
		
		in.Outtershow();
		


	}

}
