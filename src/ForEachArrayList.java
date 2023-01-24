import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ForEachArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listarr=new ArrayList();
		listarr.add("Altaf");
		listarr.add("Clover");
		listarr.add("BEST");
		
		System.out.println(listarr);

		listarr.forEach(n -> System.out.println(n));
		System.out.println("=====================++++++++++++++++");
		 for(int i=1;i<listarr.size();i++){
			 System.out.println(i);
		 }
		 
		 Iterator<String> it=listarr.iterator();
		 
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		

	}

}
