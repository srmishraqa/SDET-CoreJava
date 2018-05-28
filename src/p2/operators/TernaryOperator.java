package p2.operators;

public class TernaryOperator {

	public static void main(String[] args) {

		// Comparing three values using Ternary Operator
		int x = 20;
		int y = 30;
		int max;

		max = (x > y) ? x : y;
		System.out.println(max);

		System.out.println("****************************");

		// The above is the implementation of this
		if (x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println(max);

		System.out.println("****************************");

		// Normal Notation

		int price = 100;
		int disc = 20;
		price = price - disc;
		System.out.println(price);

		System.out.println("****************************");

		// Using Compact Notation

		int price1 = 120;
		int disc1 = 30;
		price1 -= disc1;
		System.out.println(price1);

	}

}
