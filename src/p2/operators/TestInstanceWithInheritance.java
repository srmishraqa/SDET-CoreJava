package p2.operators;

public class TestInstanceWithInheritance extends TestInstance {

	public static void main(String[] args) {

		TestInstanceWithInheritance t2 = new TestInstanceWithInheritance();
		Boolean bb = t2 instanceof TestInstanceWithInheritance;
		System.out.println(bb);

		System.out.println("********************************************");
		Boolean bb1 = t2 instanceof TestInstance;
		System.out.println(bb1);

	}

}
