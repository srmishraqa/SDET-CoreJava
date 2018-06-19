package p4.ifelse;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		int x, y, z;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		in.close();

		if (x > y && x > z)
			System.out.println(x + " is the greatest");
		else if ( y > z)
			System.out.println(y + " is the greatest");
		else 
			System.out.println(z + " is the greatest");
		
	}

}
