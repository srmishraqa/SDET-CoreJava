package programsforinterview;

import java.util.Arrays;

public class SortCharacterInAString {

	public static void main(String[] args) {
		
		String string = "lebanon";
		char tempArray[] = string.toCharArray();
		Arrays.sort(tempArray);
		
		System.out.println(tempArray);

	}

}
