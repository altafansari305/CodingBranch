import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(32);
		arr.add(33);
		arr.add(34);
		arr.add(35);
		arr.add(32);
		arr.add(33);
		
		
		//arr.forEach((n) -> System.out.println(n));
		
		System.out.println("Foreach Loop =============++++++");
		for (int a : arr){
			System.out.println(a);
		}
		System.out.println("======================++++++++++++++++++++++++++++=======");
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(34);
		hs.add(33);
		
		hs.add(35);
		hs.addAll(arr);
		
		Integer str= new Integer(33);
		hs.add(str);
		//hs.forEach(hs,arr)--> ;
		
		for ( int a :hs){
			System.out.println(a);
		}
		
	
		

	}

}
