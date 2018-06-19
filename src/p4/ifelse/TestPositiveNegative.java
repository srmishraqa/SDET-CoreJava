package p4.ifelse;

import java.util.Scanner;

public class TestPositiveNegative {
	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		var.close();

		if (n > 0)
			System.out.println(n + " is a positive number");
		else if (n < 0)
			System.out.println(n + " is a negative number");
		else
			System.out.println(n + " is a neither positive number nor negative number");
	}

}
