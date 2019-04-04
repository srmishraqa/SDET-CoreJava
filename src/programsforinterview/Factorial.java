package programsforinterview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int i, fact = 1;

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();// It is the number to calculate factorial

		sc.close();

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
