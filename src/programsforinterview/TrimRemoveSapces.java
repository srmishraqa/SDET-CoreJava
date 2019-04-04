package programsforinterview;

public class TrimRemoveSapces {

	public static void main(String[] args) {

		String text = " Soumya Ranjan Mishra ";
		String newText = text.replaceAll("\\s", "");
		
		String text1 = "Yahoo";
		String newText1 = text1.replaceAll("o", "m");

		System.out.println(newText);
		System.out.println(newText1);

	}

}
