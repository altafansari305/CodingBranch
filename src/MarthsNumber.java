import javax.swing.plaf.synth.SynthSeparatorUI;

import org.json.JSONException;
import org.json.JSONObject;

public class MarthsNumber {
	
	

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		MarthsNumber abc= new MarthsNumber();
		
		ConstructionDemo cnf=new ConstructionDemo("sdhshds");
		
		int ans=fun(100,2000);
		System.out.println("ANS >>>"+ans);
		abc.sum(6);
		System.out.println("Best values");
		
		int n=6;
		for(int i=1;i<n;i++){
			System.out.print(" "+abc.printNumber(n));
		}
		JSONObject obj=new JSONObject();
		obj.put("response", "suceess");
		obj.put("Status","ok");
		
		
		obj.toString();
		
		JSONObject obj2=new JSONObject();
		obj2.put("dbresponse", obj);
		obj2.put("name","");
		
		String responseDB=obj2.getString("dbresponse");
		
		JSONObject getres=new JSONObject(responseDB);
		
		System.out.println( getres.getString("Status"));
		
		String name=obj2.getString("name");
		
		if(name.equals("") || name==""){
			name="NA";
		}
		System.out.println("All value ==" +obj2);
		System.out.println( "name ----== "+name);
	
		
		
		//System.out.println(obj2);

	}
	
	int printNumber(int n){
		
		if( n==0 || n==1 || n==2){
			return 0;
		}
			if(n ==3){
				return 1;
			}
			else {
		return printNumber (n-1)+printNumber (n-2)+printNumber (n-3);
			}
	}
	
	
	 static int fun(int a,int b){
		if(b == 0){
			return a;
		}else
			return fun(b,a%b);
		
	}
	 public void sum(int n){
		 while(n>0)
		 { 
			 //System.out.println("Before----"+n);
			 n++;
			 n-=2;
			 System.out.println(n);
		 }
	 }

}
