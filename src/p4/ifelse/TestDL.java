package p4.ifelse;

import java.util.Scanner;

public class TestDL {
	public static void main(String[] args) {

		System.out.println("Enter the Age");
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		var.close();

		if (n < 18)
			System.out.println("The Person is underage and not eligible for DL");
		else if (n >= 18 && n <= 60)
			System.out.println("The Person is eligible for DL");
		else
			System.out.println("The Person is senior citizen and not eligible for DL");

	}

}
