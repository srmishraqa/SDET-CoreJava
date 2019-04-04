package programsforinterview;

public class SwapTwoNumbersWithoutUsingTemporaryVariable {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		x = x * y; // x now is 50
		y = x / y; // now y = current x (50)/current y(5) = 10
		x = x / y; // now x = current x (50)/current y(10) = 5

		System.out.println("The Value of X is : " + x);
		System.out.println("The Value of Y is : " + y);

	}

}
