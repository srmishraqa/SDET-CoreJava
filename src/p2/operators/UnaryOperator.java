package p2.operators;

public class UnaryOperator {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		// unary minus operator
		System.out.println(-x);
		System.out.println(-(-y));

		// Pre-increment and post-increment operator
		y = ++x + ++y + y++ + x++;
		System.out.println(x);
		System.out.println(y);

		// Decrement Operator
		int x1 = 10;
		int y1 = 20;
		x1 = --y1 + x1-- + --y1 + --x1;
		System.out.println(x1);
		System.out.println(y1);

	}

}
