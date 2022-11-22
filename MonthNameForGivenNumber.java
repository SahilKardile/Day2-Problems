package Day2_Problems;

import java.util.Scanner;

public class MonthNameForGivenNumber 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Month number");
		
		int A= scan.nextInt();
		
		switch (A)
		{
		case 1: System.out.println("Given number month is January"); 
		break;
		case 2: System.out.println(" Given number month is February"); 
		break;
		case 3: System.out.println("Given number month is March"); 
		break;
		case 4: System.out.println("Given number month is April");
		break;
		case 5: System.out.println("Given number month is May"); 
		break;
		case 6: System.out.println("Given number month is June"); 
		break;
		case 7: System.out.println("Given number month is July"); 
		break;
		case 8: System.out.println("Given number month is August"); 
		break;
		case 9: System.out.println("Given number month is September");
		break;
		case 10: System.out.println("Given number month is October"); 
		break;
		case 11: System.out.println("Given number month is November"); 
		break;
		case 12: System.out.println("Given number month is December");
		break;
		default:System.out.println("Enter correct number");
		
		}
		
	}

}
