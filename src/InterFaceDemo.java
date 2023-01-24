
public class InterFaceDemo implements details,objectDemo {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" ==== Show method ===== + ====  ");
		
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		
		System.out.println(" === SHOW DETIALS ==== ");
		
	}

	public static void main(String args[]){
		
		InterFaceDemo fd= new InterFaceDemo();
		fd.showDetails();
		fd.show();
		
	}
}
