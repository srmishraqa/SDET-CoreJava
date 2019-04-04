package programsforinterview;


public class IsSmallPrime {

	static void is_small_prime(int n){  
		 int i,m=0,flag=0;      
		  m=n/2; 
		  if(n>=0 || n<=50) {
		  if(n==0||n==1){  
		   System.out.println("no");
		   System.out.println("ok and exit with an exit code of 0");
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println("no"); 
		     System.out.println("ok and exit with an exit code of 0");
		     flag=1; 
		     break; 
		    }
		     
		    }      
		   }      
		   if(flag==0)  { System.out.println("Yes");
		   System.out.println("ok and exit with an exit code of 0");}  
		  } 
		}
		  
	
	
	public static void main(String[] args) {
		
		is_small_prime(10);
		is_small_prime(7);
		is_small_prime(51);
		
	}

}
