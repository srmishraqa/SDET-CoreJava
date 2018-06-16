package p2.operators;

public class OperandPrecedence {

	public static void main(String[] args) {

		System.out.println(m1(1) + m1(2) * m1(3) / m1(4) + m1(5) * m1(6));
	}

	public static int m1(int i) {
		System.out.println(i);
		return i;
	}


}

// Here 1st operands will be evaluated from left to right -- no precedence
// once operands evaluation is done operators will come into picture
// if some operands have same precedence execution will happen from left to
// right