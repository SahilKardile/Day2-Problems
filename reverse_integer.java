package Day2_Problems;

public class reverse_integer 
{
	public static void main(String[]args)
	{

	    int num = 123;
	    int rev = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      rev = rev * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + rev);
	  
		}

	
}
