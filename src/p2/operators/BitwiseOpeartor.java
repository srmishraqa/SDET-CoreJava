package p2.operators;

public class BitwiseOpeartor {
	
//& - AND - returns true only if both conditions are true
//| - OR -	returns true if any of the condition is true
//^ - X-OR - returns true if both conditions are different
//Applicable for boolean and Integer type

	public static void main(String[] args) {
	
		Boolean b1=true;
		Boolean b2=false;
		
		System.out.println(b1 & b2);
		System.out.println(b1 | b2);
		System.out.println(b1 ^ b2);
		
		System.out.println("****************");
		
		int x = 40 ;
		int y = 50;
		System.out.println(x & y);
		System.out.println(x | y);
	    System.out.println(x ^ y);
		
		System.out.println("****************");
		
		int x1 = 4;
		int y1 = 5;
		System.out.println(x1 & y1);
		System.out.println(x1 | y1);
	    System.out.println(x1 ^ y1);
	}

}
