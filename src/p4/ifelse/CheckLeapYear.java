package p4.ifelse;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

		System.out.println("Enter a Year You want to check");
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		var.close();

		if (n % 4 == 0 && n % 100 != 0)
			System.out.println(n + " year is a Leap Year");
		else if (n % 400 == 0)
			System.out.println(n + " year is a Leap Year");
		else
			System.out.println(n + " year is not a Leap Year");

	}

}
