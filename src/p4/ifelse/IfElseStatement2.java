package p4.ifelse;

public class IfElseStatement2 {

	public static void main(String[] args) {

		// In if-else else part is optional
		// in if-else in if part curly brace is optional
		// in if-else in if part without braces we can write only one statement and
		// it should not be declarative statement

		// Scenario-1 (valid)
		if (true)
			System.out.println("Hello");
		
		// Scenario-2 (valid)
				if (true);
									
		// Scenario-3 (invalid)
				if (true)
				//int x=10;//it is invalid as it's a declarative statement without braces
				
		// Scenario-4 (valid)
				if (true) {
					int x =10;
				}
	}

}