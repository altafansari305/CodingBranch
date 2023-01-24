import org.json.JSONObject;

public class ExceptionDemo {
	
	
	

	public static void main(String[] args) {
		String a=null;
		
		
		try{
			JSONObject json=new JSONObject(a);
			System.out.println(json); 
			//System.out.println(json.get(a)); 
			
		}catch(NullPointerException e){
			
			System.out.println("NULL   ===="+e);
		}
		catch(Exception e){
			System.out.println("Exception === "+e);
		}
		

	}

}
