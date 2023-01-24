import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadDemo {

	public static void main(String[] args) throws JSONException {
		/*MultipartFile file = null;

		file.getSize();
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		System.out.println("File Extension "+extension);*/
		String number;
		
		String jsonvalues="{'formID':'1556372004641','layoutid':'"+null+"','formlead':"+null+"}"; 
			
		String Jsonarray="{'response':{'Response':[{'responseMessage':'Unable to fetch data','responseCode':'01'},{'responseMessage':'success','responseCode':'00'}]}"
				+ ",'status':'Successfull'}";  
		
		JSONObject CustReq = new JSONObject(jsonvalues);
		JSONObject CustReq1 = new JSONObject(Jsonarray);
		
		//CustReq.put("Leadid",null);
		//CustReq.put("formid","01010");
		
		System.out.println("response  number >>>"+CustReq1.getString("response"));
		
		String mandateresponse=CustReq1.getString("response");
		JSONObject mandateresponsejson = new JSONObject(mandateresponse);
		
		System.out.println(mandateresponsejson.getString("Response"));
		String array=mandateresponsejson.getString("Response");
		JSONArray arraydetials=new JSONArray(array);
		
		for (int i=0;i<arraydetials.length() ;i++){
			System.out.println("Array Response mesg"+arraydetials.getJSONArray(1)); 
		}
		System.out.println("responseMessage"+arraydetials.optString(0, "responseMessage"));
		  SimpleDateFormat df1 = new SimpleDateFormat("yyddmmhhss");  
		  Date date1=new Date();
		 System.out.println("Sate Foramta ddmmss"+ df1.format(date1));
		
		//CustReq.put("leadid", null);
		Object name1=null;
		
		if(name1==null){
			System.out.println("True");
			name1="Alataf";
		}
		
		System.out.println(name1);
		
		
		String form=CustReq.getString("formID");
		Object lead=CustReq.getString("formlead");
		if(lead=="null"){
			lead="Altaf";
		}else{
			lead="NA";
		}
			
		
		System.out.println(CustReq);
		System.out.println("GET values"+form+" >>>lead>>> "+lead);
		
		
		String fileName = "asdasd";
		//int lastindex=fileName.lastIndexOf(',');
		
		
		/*if (fileName.indexOf(".") != fileName.lastIndexOf(".")) {
			System.out.println("if loop"+fileName);
		    // More then one dot...
		}else{
		
			String extentionexp=getFileExtension(fileName);
			System.out.println("file extentionexp >>>>> "+extentionexp);   
		}*/
		//if(!(fileName ==null || fileName.isEmpty())){
			if (fileName != null && !fileName.isEmpty()){
			fileName.substring(0, 1); 
			System.out.println("file isEmpty >>>>> ");   
		}
		
		
		System.out.println(fileName);

	}

	public static String getFileExtension(String fileName) {
		System.out.println("=======Inside getFileExtension Method fileName======================" + fileName);
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		else
			return "";
	}

}
