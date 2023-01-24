
public class ForLoopDemo {

	public static void main(String[] args) {
		int number=10;
		byte by1=111;
		short sh1= 6868;
		int age1=1000100001;
		float f1=121;
		double d=238;
		char a='s';
		boolean b=true;
		
		by1=(byte)d;
		
		int shift= -11;
		int shift_change= shift >>> 10;
		
		///shift ^=shift;
		
		if (number == 10 & shift == -11){
			System.out.println("True--");
			
		}
		
		if(b){
			System.out.println(" B true ");
		}
		
		System.out.println(shift+" Shift values " +shift_change);
	
		System.out.println(" BYTES "+by1+"double convert into byte"+f1);
		String name=" \b Altaf \n Ansari ";
		System.out.println(" String Value "+name + " next value");
		
		for (int i=0;i<number;i++){
			//System.out.print(i+" ");
			
			for(int j=0;j<i;j++){
			
			
			System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
				

	}

}
