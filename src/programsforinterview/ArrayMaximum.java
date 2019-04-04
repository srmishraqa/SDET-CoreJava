package programsforinterview;

public class ArrayMaximum {

	public static void main(String[] args) {
		
		int temp;
		
		int a[] = {30,40,70,21,27,93,24};
		

		
		   for (int j = 1; j < a.length; j++) {
		    for (int k = j; k > 0; k--) {
		     if (a[k] < a [k - 1]) {
		      temp = a[k];
		      a[k] = a[k - 1];
		      a[k - 1] = temp;
		     }
		    }
		   }
		
		//Arrays.sort(a);
		   
		   System.out.println(a[a.length-1]);
		   System.out.println(a[a.length-2]);
		   
		   //Arrays.sort(a);
		   
		   
		   //for (int l = 0; l < a.length; l++) {
			//     System.out.println(a[l]);
			//   }
		
	}

}
