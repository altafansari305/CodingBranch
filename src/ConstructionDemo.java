
 class ConstructionDemo {
	 int c,d;
	 
	public static void main(String[] args)  {
		System.out.println("This is done");
		ConstructionDemo cnf=new ConstructionDemo();
		
		ConstructionDemo cnf1=new ConstructionDemo("ONE PARAMETERS");
		cnf.add(10, 10);
		try{
		
		cnf =cnf1;
		//cnf=null;
		cnf.addSum();
		cnf1.addSum();
		cnf.ConstructionDemo();
		System.out.println(cnf);
		System.out.println(cnf1);
		}  
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public ConstructionDemo() {
	System.out.println("Default Call construction...");
	}
	public String ConstructionDemo() {  
		System.out.println("method Call construction...");
		
		return "THABHHH";
		}
	
	public ConstructionDemo(String agr) {
		System.out.println("String ---construction..."+agr);
		}
	
	void add(int a,int b){
		c=a;
		d=b;
		System.out.println("Add the value"+(c+d));
	}
	
	void addSum(){
		
		System.out.println("Add the value"+(c+d));
	}
	
	
	
}
