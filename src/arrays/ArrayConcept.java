package arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array - is the data structure which holds multiple sequence of values of same
		// type
		// it works for all primitive types and even for String

		// create an array
		int my_int_var = 10;// int variable single
		int[] my_array;// declare
		my_array = new int[10];// assigning the no of elements and create an array

		// once again
		int[] my_arr = new int[15];// array name is my_arr with integer type and with 15 separate slots

		// saving elements to array
		// my_arr[0] = 12;// 1st element -- index 0 always

		// same way we can create and assign values for other data type arrays
		double[] myDoubleArray = new double[10];
		myDoubleArray[5] = 20.05;

		// Retrieving an array element
		System.out.println(myDoubleArray[5]);

		// Assigning multiple
		// my_arr = {13,14}; this can't be done during reassignment
		// it can be only done during creation of the array

		// Assigning all values during declaration -- first time
		int[] mySecondIntArray = { 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
		// java creates an array and add all the elements also got to know the counts as
		// we assign them

		System.out.println(mySecondIntArray[0]);
		System.out.println(mySecondIntArray[4]);
		System.out.println(mySecondIntArray[7]);
		System.out.println(mySecondIntArray[9]);

		// 3rd way to initialize -- using for loop

		int[] myIntArray = new int[10];
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i * 10;
		}
		System.out.println("********************");
		for(int i=0; i< mySecondIntArray.length;i++) {
			System.out.println("Element at "+i +" is " +myIntArray[i]);
		}

	}

}
