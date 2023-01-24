
public class FinalKeywordDemo {

	final int kill=10;
	
	
	static {
		int a=1;
		System.out.println("Static blogs "+a);
	}
	void show(){
		
		System.out.println("Show method..."+kill);
	}
	
	double show(int a){
		
		System.out.println("Int method call");
		return 1;
	}
	
	  
	final void show1(int a){
		System.out.println("final blogs"+a);
	}

	public static void main(String[] args) {

		FinalKeywordDemo fd=new FinalKeywordDemo();
		fd.show();
		System.out.println("Main Method...");
		//System.out.println(fd.show());
		System.out.println(fd.show(10));
		
		
	}
	
	
}
