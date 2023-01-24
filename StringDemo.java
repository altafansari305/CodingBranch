
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDemo {

	public static void main(String[] args) {
	
		
		String str1="scaler";
		
		String str2="scaler";
		
		String str3= new String("scaler");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str3));
		
		 String pattern = "MMddyyyyHHMMSS";
		   SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		   String date = simpleDateFormat.format(new Date());
		   System.out.println(date+">>>>>>>>>>");
	}

}
