package p5.switchcase;

import java.util.Scanner;

public class QuarterOutputBasedOnMOnth {

	public static void main(String[] args) {

		System.out.println("Enter a Month Name");

		Scanner var = new Scanner(System.in);
		int month = var.nextInt();
		var.close();

		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("Month belongs to Q-4");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Month belongs to Q-1");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Month belongs to Q-2");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Month belongs to Q-3");
			break;
		default:
			System.out.println("This is an invalid month");

		}
	}
}
