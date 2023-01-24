import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArrayDemo {

	public static void main(String[] args) throws JSONException {
		JSONObject obj=new JSONObject();
		obj.put("mobilenumber", "9768908767");
		obj.put("name", "Altaf Ansari");
		
		JSONArray array=new JSONArray();
		
		JSONObject obj1=new JSONObject();
		JSONObject obj2=new JSONObject();
		
		obj1.put("umrn","10100101");
		obj1.put("Mobile_No","98090909090");
		obj2.put("umrn","90909090");
		obj2.put("Mobile_No","8678676767");
		array.put(obj1);
		array.put(obj2);
		
		obj.put("mandates", array);
		
		System.out.println(obj);
		
		System.out.println("mandates array"+obj.getString("mandates"));
		
		JSONArray getmandates= obj.getJSONArray("mandates");
		
		JSONArray arraydetials=new JSONArray();
		
		JSONObject requestJson=new JSONObject();
		
		for(int i=0;i<getmandates.length();i++)
        {
            JSONObject jsonObject1 = getmandates.getJSONObject(i);  
            String umrn = jsonObject1.optString("umrn");
            String Mobile_No = jsonObject1.optString("Mobile_No");
          
            System.out.println("umrn >>>>>>"+umrn+" >>>>Mobile_No>" +Mobile_No);
            
            JSONObject arraymandate1 = new JSONObject(); 
            arraymandate1.put("umrn",umrn);
            arraymandate1.put("montranID", "MMSPYTM000000089120171"+i+"00");
            arraymandate1.put("Mobile_No", Mobile_No);
            arraymandate1.put("CancellationReason", "CI00");  
            arraydetials.put(arraymandate1);  
            
            
        }
		requestJson.put("list",arraydetials);
		System.out.println("JSON ARRAAY VALUES"+arraydetials);
		System.out.println(getmandates);
		
		System.out.println("Request JSON ====="+requestJson);
		

	}

}
