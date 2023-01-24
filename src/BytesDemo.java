
public class BytesDemo {

	public static void main(String[] args) {
		
		String val="1234569";
		byte h [] ={Byte.parseByte(val)};
		
		byte [] h1=val.getBytes();
		byte [] ad= {64};	
	
		System.out.println("BYTES ======="+h1);
		System.out.println("BYTES ad ======="+ad);
	
		

	}

}
