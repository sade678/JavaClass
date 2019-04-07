package bronxPackage;

public class Student {

	String name,gender;
	int age;
	long phone;
	
	
	
		
		
		
		void setInformation(String n,String m, long ph, int ag) { // using parameter
			
			name = n;
			gender = m;
			phone = ph;
			age = ag;
		}
		
		void displayInformation() {
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Phone :"+phone);
		System.out.println("Name :"+age);
		
		}
		
		
		public static void main(String[] args) {
			Student student = new Student();
			student.setInformation("shaju","male",6462718726L,42); // this method will pass info
			student.displayInformation();
		

		}

}
