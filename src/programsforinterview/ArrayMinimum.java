package programsforinterview;

public class ArrayMinimum {

	public static void main(String[] args) {
		
		int temp;
		
		int a[] = {10,20,30,40,50,60};
		
		for(int i=1;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if (a[j]>a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
				
	}

		
		System.out.println(a[a.length-1]);
}
}