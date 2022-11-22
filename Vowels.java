package Day2_Problems;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("\n Enter Character: ");

		char A= scan.nextLine().charAt(0);
		char B= Character.toUpperCase(A);
		
		switch(B)
		{
		case 'A':System.out.println( B +  " Is a vowel.");
		case 'E':System.out.println( B +  " Is a vowel.");
		case 'I':System.out.println( B +  " Is a vowel.");
		case 'O':System.out.println( B +  " Is a vowel.");
		case 'U':System.out.println( B +  " Is a vowel.");
		break;
		default: System.out.println(B+ " Is a Non Vowel character");
		}
	
	
 }	
}
	


