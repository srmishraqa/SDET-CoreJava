package test;

import java.util.Scanner;

public class TestPrimeNumber {
	
	public static void is_small_prime() {
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
	        scan.close();
	    if (num>=0 || num<=50){
	    	for(int i=2;i<=num/2;i++)
			{
		           temp=num%i;
			   if(temp==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
			
		}
	    else {
			System.out.println("The Input range is not beteewn 0-50");
		}
	    if(isPrime) {
			   System.out.println("yes");
	                 System.out.println("ok");
	    }
			else {
			   System.out.println("no");
			   System.out.println("ok");
			}
	    }
	
			        
		
	

	public static void main(String[] args) {
		is_small_prime();

	}

}
