import java.util.Scanner;
import java.util.*;

class Clock
{
	public static void main (String args[])
	{
		// Ask for user's name
		
		System.out.println("Enter your name ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		// Present time & date
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		// Display Message
		
		if (hour  < 12)
		{
			System.out.print("Good morning and have a wonderful day " + name + "!.\n");
			
		} else if (hour < 17) {
			System.out.print("Good Afternoon " + name + "!.\n");
		} else {
			System.out.print("Good Evening! " + name + "!.\n");
			
		}
		
		// Show minutes
		
		System.out.print("It is");
		if (minute != 0)
		{
			System.out.print(" " + minute + " ");
			System.out.print( (minute != 1) ? "minutes" : "minute");
			System.out.print(" past");
		}
		
		// Show hour
		
		System.out.print(" ");
		System.out.print((hour > 12) ? (hour - 12) : hour);
		System.out.print(" o'clock on ");
		
		// Show Month
		
		switch (month)
		{
		case 1:
			System.out.print("January");
			break;
			
		case 2:
			System.out.print("February");
			break;
			
		case 3:
			System.out.print("March");
			break;
			
		case 4:
			System.out.print("April");
			break;
			
		case 5:
			System.out.print("May");
			break;
			
		case 6:
			System.out.print("June");
			break;
			
		case 7:
			System.out.print("July");
			break;
			
		case 8:
			System.out.print("August");
			break;
			
		case 9:
			System.out.print("September");
			break;
			
		case 10:
			System.out.print("October");
			break;
			
		case 11:
			System.out.print("November");
			break;
			
		case 12:
			System.out.print("December");
			break;
		}
		
		// Show Date and Year
		
		System.out.println(" " + day + ", " + year + ".");
		
	}
}