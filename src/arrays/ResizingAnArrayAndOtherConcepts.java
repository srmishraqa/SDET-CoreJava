package arrays;

import java.util.Scanner;

public class ResizingAnArrayAndOtherConcepts {

	static Scanner scanner = new Scanner(System.in);
	static int[] basedata = new int[10];
	

	public static void main(String[] args) {
		System.out.println("Enter 10 Elements: \r");
		GetInput();
		printArray(basedata);
		resizeArray();
		System.out.println("Enter the 12 integers");
		GetInput();
		printArray(basedata);
	}

	static void GetInput() {
		for (int i = 0; i < basedata.length; i++) {
			basedata[i] = scanner.nextInt();
		}
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("the value at " + i + " is " + array[i]);
		}
	}

	static void resizeArray() {
		int[] original = basedata;
		basedata = new int[12];
		for(int i = 0;i< original.length;i++) {
			basedata[i] = original[i];
		}
	}

}
