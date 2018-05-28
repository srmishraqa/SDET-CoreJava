package p2.operators;

public class BitShiftOpeartor {

	public static void main(String[] args) {
		
		//Bitwise Complement Operator
		
		int x = 4;
		int y = 28;
		System.out.println(~x);
		System.out.println(~y);
		System.out.println("*********************");
		
		int y1 = 28;
		int z1 = -30;
		System.out.println(y1 & z1);
		System.out.println(y1 | z1);
		System.out.println(y1 ^ z1);
		System.out.println("*********************");
		
		int a1=10;
		System.out.println(a1<<2);
		System.out.println("*********************");
		
		int a2 = 28;
		System.out.println(a2>>3);
		System.out.println("*********************");
		
		int a3 = 30;
		System.out.println(a3>>>2);
		System.out.println("*********************");
		
		int a4 = -45;
		System.out.println(a4>>>3);
		System.out.println("*********************");
	}

}
