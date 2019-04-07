package bronxPackage;

import java.util.Arrays;

public class TwoDimentionArrays {

	public static void main(String[] args) {
		
		int[][] ad={{23,34,56},{23,78,57},{56,45}};
				
		System.out.println(Arrays.deepToString(ad));
		for(int i=0;i<ad.length;i++){
			for(int k=0;k<ad[i].length;k++){
				//System.out.println(ad[i][k]);
				System.out.print(ad[i][k]+",");
			}
		}
		

	}

}
