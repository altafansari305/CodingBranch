/**
 * 
 */

/**
 * @author adms.java1
 *
 */
public class MethodDemoProgram {

	static int width;
	static int height=10;;
	static int weight;
	
	public static void show(){
		System.out.println("SQUARE "+ (width+height+weight));
		
	}
	
	void getValue(double a){
		System.out.println(" double "+a);
	}
	void getValue(){
		System.out.println(" NO Argument method -");
	}
	
	public static void main(String[] args) {
		
		MethodDemoProgram mb=new MethodDemoProgram();
		MethodDemoProgram mb1=mb;
		MethodDemoProgram.height=10;
		mb.weight=20;
		mb.width=30;
	
		mb1.height=15;
		mb1.weight=20;
		mb1.width=11;
		
		mb.show();
		
		mb1.show();
		mb.getValue();
		mb.getValue(10.00f);
		mb.getValue(15.03f);
		mb.getValue(19);
		

	}

}
