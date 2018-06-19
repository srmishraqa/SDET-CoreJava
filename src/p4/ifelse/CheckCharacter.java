package p4.ifelse;

import java.util.Scanner;

public class CheckCharacter {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Character");
		Scanner var = new Scanner(System.in);
		char ch = var.next().charAt(0);
		var.close();
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch+" is a alphabet");
		else if (ch>='0' && ch<='9')
			System.out.println(ch+" is a digit");
		else
			System.out.println(ch+" is a special character");
		
	}

}
