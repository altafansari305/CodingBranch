import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int number =6;
		for (int i=0; i<number ;i++){
			System.out.println(i+" loop i value");
			
			switch(i){
			
			case 1:System.out.println("One number ");
			break;
			case 2:System.out.println("two number ");
			break;
			case 3:System.out.println("three number ");
			break;
			default : System.out.println(" Default values");
			
			}
		}
		
		System.out.println("Enter the any number --");
		int value =sc.nextInt();
		
		switch(value){
		
		case 1:System.out.println("One number ");
		break;
		case 2:System.out.println("two number ");
		break;
		case 3:System.out.println("three number ");
		break;
		default : System.out.println(" Default values");
		
		}
		
		
		
	}

}
