
public class ArrayDemo {

	public static void main(String[] args) {
	int arr[] = {9898,1321,232,232,23};
	System.out.println(arr[3]);
	int month[] =new int[12];
	
    month[0]=31;
    month[1]=28;
    month[2]=31;
    month[3]=30;
    month[4]=31;
    month[5]=20;
   // month[13]=28;
    
    System.out.println( month[5]);
    
    
    int day_month[][] =new int[5][4];
    
    day_month[0]=new int[4];
    
    day_month[0][3]=22;
    day_month[0][2]=21;
    
    day_month[1][3]=20;
    
    for(int i=0;4>i;i++){
    	 
    	for(int j=0;4>j;j++){
    	 System.out.println("i "+i+" values"+day_month[i][j]);
     }
    }
    
    //System.out.println(day_month[0][3]);
    
	}
	
}
