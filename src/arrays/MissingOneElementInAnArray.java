package arrays;

import java.util.Scanner;

public class MissingOneElementInAnArray {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myIntArray = getIntegers(9);
		int missing_element = findMissingElement(myIntArray, 10);
		System.out.println("The missing element in this array is " + missing_element);

	}

	public static int findMissingElement(int[] array, int number) {
		int total = 0;
		int element_missing;
		int arraysum = 0;

		for (int i = 0; i < array.length; i++) {
			arraysum = arraysum + array[i];
		}

		total = number * (number + 1) / 2;

		element_missing = total - arraysum;
		return element_missing;
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " Integer values \r");
		int values[] = new int[number];
		for (int i = 0; i < number; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}
}
