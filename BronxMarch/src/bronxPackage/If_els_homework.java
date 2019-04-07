package bronxPackage;

public class If_els_homework {

	public static void main(String[] args) {
		
		// 1. Using if-else concept buy an item which is priced $100 and less than $200 between 4 stores
		// & make sure the third store has the item.

		int st1=80;
		int st2=90;
		int st3=100;
		int st4=200;
		int cash=100;
		
		if (st1==cash) {
			System.out.println("bought from st1");
		}
		else if (st2==cash) {
			System.out.println("bought from store 2");
		}
		
	
	else if(st3==cash) {
		System.out.println("bought from store 3");
	}

   else if(st4==cash) {
	System.out.println("bought from store 4"); // Return bought from store 3
}
	
	//2. Using switch concept find out a Wednesday from a week, number the days 1-7 
		
		int day = 3;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");// Return Wednesday
		    break;
		}
	//3. Using switch concept find out a June from a year, number the months 1-12 
	
		int months = 6;
		switch (months) {
		  case 1:
		    System.out.println("Jauary");
		    break;
		  case 2:
		    System.out.println("February");
		    break;
		  case 3:
		    System.out.println("March");
		    break;
		  case 4:
		    System.out.println("April");
		    break;
		  case 5:
		    System.out.println("May");
		    break;
		  case 6:
		    System.out.println("June");
		    break;
		  case 7:
		    System.out.println("July");
		    		    break;
		  case 8:
			    System.out.println("August");
			    break;
			  case 9:
			    System.out.println("September");
			    break;
			  case 10:
			    System.out.println("October");
			    break;
			  case 11:
			    System.out.println("November");
			    break;
			  case 12:
			    System.out.println("December");// Return June
			    break;
		}
	
//		//4.Using for loop print from -240 to 330 with 15 interval
		for(int i=-240;i<=330;i=i+15){  
			System.out.println(i);  
			}  
		//Using for loop print from 999 to -560 with 20 interval
		
		for(int i=999;i<=-560;i=i-20){  
			System.out.println(i);  
			}  
	
	//Using while printing from 150 to 99 
		
		int y = 150;
		while(y < 99) {
		  System.out.println(y);
		  y++;
		}
		//7.Using do while printing from 345 to 765
		
		int x=345;  
		do{  
		System.out.println(x);  
		x++;  
		}while(x<=765); 
		
		
	}

}
