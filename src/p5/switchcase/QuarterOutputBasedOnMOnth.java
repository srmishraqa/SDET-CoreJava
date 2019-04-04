package p5.switchcase;

import java.util.Scanner;

public class QuarterOutputBasedOnMOnth {

	public static void main(String[] args) {

		System.out.println("Enter a Month Name : ");

		Scanner var = new Scanner(System.in);
		String month = var.next();
		var.close();

		switch (month.toLowerCase()) {
		case "jan":
		case "feb":
		case "mar":
			System.out.println("Month belongs to Q-4");
			break;
		case "apr":
		case "may":
		case "jun":
			System.out.println("Month belongs to Q-1");
			break;
		case "jul":
		case "aug":
		case "sep":
			System.out.println("Month belongs to Q-2");
			break;
		case "oct":
		case "nov":
		case "dec":
			System.out.println("Month belongs to Q-3");
			break;
			//for rest all values we use default keyword
		default:
			System.out.println("This is an invalid month input ");

		}
	}
}
