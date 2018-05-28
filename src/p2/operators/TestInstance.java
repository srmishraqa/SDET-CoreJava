package p2.operators;

public class TestInstance {

	public static void main(String[] args) {

		// Checking instanceof Operator
		TestInstance t1 = new TestInstance();
		TestInstance t3 = null;
		Boolean b1;
		Boolean b2;
		b1 = t1 instanceof TestInstance;
		System.out.println(b1);
		System.out.println("******************");
		b2 = t3 instanceof TestInstance;
		System.out.println(b2);

	}

}
