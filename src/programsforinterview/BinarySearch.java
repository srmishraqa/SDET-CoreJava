package programsforinterview;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int a[] = {15,47,32,56,98,43,69,74,86,99,91};
		Arrays.sort(a);
		int mid = (a[a.length-1]+a[0])/2;
		System.out.println(mid);
		
		
		
//----------------------------------------------------------------		
//		int index = Arrays.binarySearch(a, 47);
//		System.out.println(index);
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(15);
		al.add(10);
		al.add(50);
		al.add(32);
		al.add(56);
		al.add(57);
		al.add(99);
		al.add(34);
		
//		Collections.sort(al);
//		int index = Collections.binarySearch(al, 57);
//		System.out.println(index);
		
		
		
	}

}
	

	    