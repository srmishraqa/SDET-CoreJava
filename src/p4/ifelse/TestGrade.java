package p4.ifelse;

import java.util.*;

public class TestGrade {

	public static void main(String[] args) {

		System.out.println("Enter the percentage scored by the student");
		Scanner var = new Scanner(System.in);
		int n = var.nextInt();
		var.close();

		if (n >= 90)
			System.out.println("The Student has Scored 'O' Grade");
		else if (n >= 80 && n <= 89)
			System.out.println("The Student has Scored 'E' Grade");
		else if (n >= 70 && n <= 79)
			System.out.println("The Student has Scored 'A' Grade");
		else if (n >= 60 && n <= 69)
			System.out.println("The Student has Scored 'B' Grade");
		else if (n >= 50 && n <= 59)
			System.out.println("The Student has Scored 'C' Grade");
		else
			System.out.println("The Student has Scored 'D' Grade");
	}

}
