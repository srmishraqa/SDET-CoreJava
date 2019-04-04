package programsforinterview;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
		if(reversed==num) {
			System.out.println("Palindrome");
		}
		
		}

}
