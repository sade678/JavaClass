package bronxPackage;

public class Return {
	
	
	public int a=10, b=20;
	public void multiply () {
	int result;
	result = a+b;
	System.out.println("multiply of a + b = "+result);	
	}

	public static void main(String[] args) {
		
		Return rt=new Return();
		
		rt.multiply();
		
	}
 
}
