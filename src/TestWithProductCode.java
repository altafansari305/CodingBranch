
public class TestWithProductCode extends RamdomDemo {

	public static void main(String[] args) {
		String MainProduct="Life Insurance(10101 | 102430)"; 
		
		System.out.println("Full Product Name===="+MainProduct);
		
		try{
		int pi=MainProduct.indexOf("(");
		int qi=MainProduct.lastIndexOf(")");
		
		String productCode=MainProduct.substring(pi+1,qi);
		String productName=MainProduct.substring(0,pi);
		
		System.out.println("Only Product Code ======"+productCode);
		System.out.println(" Product Name ======"+productName);
		
		if(productName.equals("Used Vehicle Loan")){
			System.out.println("YEs You In");
		}else if(productName.equals("Life insurance")){
			System.out.println("YEs You In");
		}else{
			System.out.println("No else");
		}
		
		String apicardnumber=" "; 
		for(int i=1 ; i<2 ;i++){  
		String accountNumber="12343456789034";
		String newdata=accountNumber.substring(0, 4)+"-XXXX-XXXX-"+accountNumber.substring(12);
		System.out.println(newdata);
		
		
		String maskCardnumberr=accountNumber.substring(0, 4)+"-XXXX-XXXX-"+accountNumber.substring(12);
		apicardnumber = apicardnumber + "," + maskCardnumberr;
		}
		System.out.println(apicardnumber+"<<<<<<<apicardnumber");
		int numberspace=MainProduct.indexOf(" ");
		String middleName=MainProduct.substring(numberspace,pi);
		System.out.println("Middle name"+middleName);
		}catch( Exception e){
			System.out.println("catch exception...."+e);
			
		}
	
		RamdomDemo rm = new RamdomDemo();
	}

}
