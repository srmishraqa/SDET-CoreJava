package p2.operators;

public class TestPostDecrementOperator {

	public static void main(String[] args) {

		int x1 = 10;
		int y1 = 20;

		x1 = --y1 + x1-- + --y1 + --x1;

		System.out.println(x1);
		System.out.println(y1);

	}

}
