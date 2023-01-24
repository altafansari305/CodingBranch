import java.util.Scanner;

public class ForEachDemo {

	public static void main(String[] args) {
	
		int number[] ={10,20,20,14,15,12,15,18};
		
		int sum=0;
		
		for(int i : number){
			
			System.out.println("values "+i);
			sum =sum+i;
			
		}
		System.out.println("Total "+sum);
		//Scanner sc=new Scanner(System.in);
		Object ab=new Object();
		ForEachDemo rf=new ForEachDemo();
		System.out.println( rf.getClass());
		System.out.println(ab.getClass());
	}

}
