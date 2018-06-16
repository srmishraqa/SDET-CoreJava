package p4.ifelse;
import java.util.Scanner;

public class TestNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		var.close();// it will close the Resource Leak
		
		if(n==0) {
			System.out.println("The number is neither positive nor negative");
		} 
		else if(n>0)
		{
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
		
	}

}
