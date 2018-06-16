package p4.ifelse;
//-----------------------------------------------------------------------------------------

//Syntax:

/*
 * if(boolean b) {
   Actions statements for b is true
   }
   else {
   Action statements for b is false;	
   }
*/
//the argument to if statement should always have boolean type
//if we try to provide any other type in the if argument then we will get compile time error

//------------------------------------------------------------------------------------------
public class IfElseStatement {

	public static void main(String[] args) {
		int x = 10;

		if (x == 20) {
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}
		
		System.out.println("***********************");
		
		boolean b = true;
		
		if(b=false) {
			System.out.println("If part is executed");
		}
		else {
			System.out.println("else part is executed");
		}
		
        System.out.println("***********************");
		
		boolean b1 = false;
		
		if(b1==false) {
			System.out.println("If part is executed");
		}
		else {
			System.out.println("else part is executed");
		}
	}

}
