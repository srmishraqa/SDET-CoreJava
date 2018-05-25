package p2.operators;

public class TestOperators {

	public static void main(String[] args) {
		
		int x = 13;
		int y = 5;
		
		//Arithmetic Operators
		int res1 = x+y;
		int res2 = x-y;
		int res3 = x*y;
		int res4 = x/y;
		int res5 = x%y;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		
		//String Concatenation
		
		//String with String
		String s1="welocme";
		String s2= "To";
		String s3=s1+s2;
		System.out.println(s3);
		
		//String with other data type
		String s4= s3+x;
		System.out.println(s4);
		
	}

}
