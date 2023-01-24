import java.util.Scanner;

public class LoopDemoPractical {

	public static void main(String[] args) {

		System.out.println("Enter the loop values");
		
		Scanner sc=new Scanner(System.in);
		
		int val=sc.nextInt();
		
		System.out.println("you enter values "+val);
		
		
		for(int i=1; i<=val;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}

	}

}
