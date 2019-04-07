package bronxPackage;

public class StaNonSta {

	
		
		
		static int a=100;// Static Variable
			   int b=200;// Non Static Variable
	
			 //Static Method
			   public static void abc() {
	System.out.println(a); //
		}
		
		//Non Static Method
	public void abc2() {
		System.out.println(a+b);
	}
			
		public void abc3() {
			System.out.println("It is a Nonstatic Method");
		}
			public static void main(String[] args) {
				abc(); // static
				
				StaNonSta obj = new StaNonSta();
				obj.abc2();  // Non static
				obj.abc3(); // Non static
	}

}
