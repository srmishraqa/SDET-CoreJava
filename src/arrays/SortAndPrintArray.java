package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndPrintArray {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myIntArray = getIntegers(5);
		int[] sortedArray = SortArray(myIntArray);
		printArray(sortedArray);

	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " Integer values \r");
		int values[] = new int[number];
		for (int i = 0; i < number; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static int[] SortArray(int[] array) {
		// copying existing array to a new array
		
//		int[] mySortedArray = new int[array.length];
//		for (int j = 0; j < array.length; j++) {
//			mySortedArray[j] = array[j];
//		}
		
		int[] mySortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		
		while (flag) {
			flag = false;
			for (int i = 0; i < (mySortedArray.length - 1); i++) {
				//descending sorting
				if (mySortedArray[i] < mySortedArray[i + 1]) {
					temp = mySortedArray[i];
					mySortedArray[i] = mySortedArray[i + 1];
					mySortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		
		return mySortedArray;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("After sorting the value at " + i + " is " + array[i]);
		}
	}

}
