package bronxPackage;

public class DifferentMethod {

	public static void main(String[] args) {
		
DifferentMethod dm=new DifferentMethod();
		
		test();
		dm.test2();

	}
	
	public static void test(){
		System.out.println("This is static method");
	}
	
	public void test2(){
		System.out.println("This is non static method");
	}

}
