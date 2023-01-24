
public class InnerClassDemo {

	int Out_number=10;
	
	
	
   class InnerMain{
		int inner_number=10;
		
		 void innerShow(){
			
			System.out.println("Inner Show");
		}
		
		
	}
	
	void Outtershow(){
		
		System.out.println("show method"+Out_number);
	}
	
}
