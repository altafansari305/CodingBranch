import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class RamdomDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		RamdomDemo rm=new RamdomDemo();
		 int rand_int1 = rand.nextInt(1000000000); 
		 
		 String number=Integer.toString(rand_int1);
		 
		 System.out.println(number);
		 
		 
		 SimpleDateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");     
	   		
       //  df.setTimeZone(TimeZone.getTimeZone("UTC"));   
   
         Date date = new Date();  
          
 	    
         df.setTimeZone(TimeZone.getTimeZone("IST"));
         String leaddate = df.format(date);
         
         System.out.println(leaddate);
         
         SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS a ");     
	   		
         df.setTimeZone(TimeZone.getTimeZone("UTC"));   
   
         Date date1 = new Date();  
         System.out.println("server time  "+df1.format(date1));   
 	    
         df.setTimeZone(TimeZone.getTimeZone("IST"));
         String leaddate1 = df.format(date);
         
         System.out.println("india time  "+leaddate1);
         
         String responsecode = null;
         /*if( ! (responsecode.equals("NA"))){
        	 System.out.println("equalsss");
         }*/
         if(!(responsecode=="") && responsecode != null ){
        	 System.out.println("null");
         }

	}
	
	
	public RamdomDemo(){
		System.out.println("Constructor call...");
	}

}
