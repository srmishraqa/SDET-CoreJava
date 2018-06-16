package p2.operators;

public class IncrementOperatorAnalysis {

	public static void main(String[] args) {

		byte a = 10;
		// a = a+1;

		// Compilation Error as max(int,type of a,type of 1) for mathematical operator
		// (int,byte,int)
		// so final output will be int but we have declared "a" as byte
		// That's why compilation error
		// Possible loss of precision
		// found int
		// required byte

		System.out.println(a);

		System.out.println("*******************");

		// Internal type casting happens for increment and decrement operator
		//
		byte b = 10;
		b++;
		System.out.println(b);

		System.out.println("*******************");

		// byte c = a+b;
		// Compilation error as max(int,byte,byte)
		// int value could not be assigned to byte
		// we need to downcast

		byte c = (byte) (a + b);
		System.out.println(c);

		// final int i1=100;
		// i1++;
		// for Final variables, Increment and Decrement Operator are not allowed
		// So compilation Error
	}
}

/*
 * Notes about Increment and Decrement Operator
 * 
 * 1.Increment and Decrement Operator applicable only for variables not for
 * constant values; 2.Listing of Increment and Decrement Operator are not
 * allowed 3.for Final variables, Increment and Decrement Operator are not
 * allowed 4.We can apply Increment and Decrement Operator for every primitive
 * type except Boolean 5.While applying Increment and Decrement Operator
 * internal type casting performed automatically
 * 
 */