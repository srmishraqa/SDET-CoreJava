package arrays;

import java.util.Scanner;

public class GetAverageOfAnArrayByGivingInputFRomConsole {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myintArray = getIntegers(5);
		System.out.println("the avergae is : " + average(myintArray));

	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " Integer values \r");
		int values[] = new int[number];
		for (int i = 0; i < number; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static double average(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return (double) sum / (double) array.length;
	}

}
