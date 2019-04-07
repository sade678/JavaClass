package bronxPackage;

public class Trim {

public static void main(String[] args) {
		
		String at="Leaning Java at Bronx";
		
		//System.out.println(at.charAt(0));
		System.out.println(at.charAt(1));
		
		for(int i=0;i<at.length();i++){
			System.out.println(at.charAt(i));
		System.out.print(at.charAt(i));
	}
		
		for(int i=at.length()-1;i>=0;i--){
			System.out.print(at.charAt(i));
		}


}

}
