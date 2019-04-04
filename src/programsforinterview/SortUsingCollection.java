package programsforinterview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {

		String domains[] = { "Practice", "Geeks", "Code", "Quiz" };

		// Here we are making a list named as Collist
		List<String> colList = new ArrayList<String>(Arrays.asList(domains));

		// Collection.sort() method is used here
		// to sort the list elements.
		 
		Collections.sort(colList);

		// Let us print the sorted list
		System.out.println( colList);
		
		
		ArrayList<String> al = new ArrayList<String>(); 
        al.add("Massan"); 
        al.add("Kabul"); 
        al.add("World War Z"); 
        al.add("Zathura"); 
        al.add("All is well"); 
  
        
        Collections.sort(al, Collections.reverseOrder()); 
        
        System.out.println(al);
  
        

	}

}
