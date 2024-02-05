package exception1;

public class arry_eception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int [5];
	try {	a[4]=23;
		System.out.println("arrey started with 0");
		
		
	}
	
	catch (Exception e)
	{System.out.println("exceoption"); 
	}
	finally {
		System.out.println("finally block");
	}
	

} 
}