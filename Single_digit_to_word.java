package Day2_Problems;

import java.util.Scanner;

public class Single_digit_to_word 
{

	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Single digit number: ");
		
		String array[]= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		int a=scan.nextInt();
		
		if(a<10)
		{
			while(a!=0)
				{System.out.println("This number is: "+array[a]);
				}
			a=scan.nextInt();
			
		}
		else
		{
			System.out.println("Please enter single digit number");
		}
		
	}
	
}
