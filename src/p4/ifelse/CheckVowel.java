package p4.ifelse;

import java.util.*;

public class CheckVowel {

	public static void main(String[] args) {
		
	
		System.out.println("Enter a character");

		Scanner var = new Scanner(System.in);
		char ch = var.next().charAt(0);
		var.close();

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println("The cahracter " + ch + " is a vowel");

		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("The cahracter " + ch + " is a consonant");

		else
			System.out.println("The cahracter is neither a vowel nor a consonant");

	}

}
