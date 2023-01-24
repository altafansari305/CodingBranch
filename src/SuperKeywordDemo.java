
public class SuperKeywordDemo extends InheritanceDemo {

	public SuperKeywordDemo() {
		super(10,20);
		int i=10;
		if(i>0||i/0==0)
		System.out.println(" Super Constructor call");
		
		super.show();
		
		try{
		}catch(ArithmeticException  | ArrayIndexOutOfBoundsException  e  ){
			System.out.println("sdsd"+e);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		InheritanceDemo ab= new SuperKeywordDemo();
		
		SuperKeywordDemo sp=new SuperKeywordDemo();
		
		
	

	}

}
