
public class InheritanceDemo {

	int a,b;
	
	void show(){
		System.out.println("Show a plus b value - "+ (a+b));
		
	}
	public InheritanceDemo(int a,int b) {
		
		System.out.println("parent Constructor call - "+ (a+b));
	}
	
	public InheritanceDemo(){
		
		System.out.println(" Parent Default Constructor call -");
	}
}
