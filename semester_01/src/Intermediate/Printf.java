package Intermediate;

import java.util.Calendar;
import java.util.Scanner;

public class Printf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Write statement(s) for each of the following:
		
		System.out.printf("%15d\n", 40000);                	// a
		System.out.printf("%d with sign: %+d\n", 200, 200);	// b
		System.out.printf("%d    as hex: %x\n", 200, 200);	// c
		System.out.printf("%09d\n", 452);										// d
		
		// Show what is printed by each of the following statements. If a statement is incorrect, indicate why.
		
		System.out.printf("%-10d\n", 10000);                // a
		// System.out.printf("%c\n", "This is a string"); 	// b - char != string
		// System.out.printf("%8.3f\n",);										// c - no argument
		System.out.printf("%#o\n%#X\n", 17, 17);            // d
		System.out.printf("% d\n%+d\n", 1000000, 1000000);  // e
		// System.out.printf("%10.2e\n",);									// f - no argument
		// System.out.printf("%d\n",);											// g - no argument
		
		// Find the error(s) in each of the following program segments. Show the corrected statement.
		// System.out.printf("%s\n",'Happy Birthday'); 								// a - String formatted as char
		System.out.printf("%s\n", "Happy Birthday");
		
		// System.out.printf("%c\n",'Hello');													// b - String != char
		System.out.printf("%s\n", "Hello");
		
		// System.out.printf("%c\n","This is a string");							// c - String != char
		System.out.printf("%s\n", "This is a string");
		
		// System.out.printf( ""%s"", "Bon Voyage" );									// d - should print"Bon Voyage"with the double quotes
		System.out.printf("\"%s\"\n", "Bon Voyage");
		
		// System.out.printf( "Today is %s\n", "Monday", "Friday" );	// f - should print "Today is Friday":
		System.out.printf("Today is %s\n", "Friday");
		
		// System.out.printf('Enter your name: ');										// h - String formatted as char
		System.out.printf("Enter your name: \n");
		
		// System.out.printf( %f,);																		// i - needs string and double for formatting
		System.out.printf(" %f\n", 1.0);
		
		Calendar dateTime = Calendar.getInstance();										// j - maybe correct? old: %1$tk:1$%tl:%1$tS
		System.out.printf("%1$tk : %1$tl : %1$tS\n", dateTime);
		System.out.printf("%S\n", dateTime);
		
		/* (Printing Dates and Times)Write a program that prints dates and times in the following forms:
		GMT-05:00 04/30/04 09:55:09 AM
		GMT-05:00 April 30 2004 09:55:09
		2004-04-30 day-of-the-month:30
		2004-04-30 day-of-the-year:121
		Fri Apr 30 09:55:09 GMT-05:00 2004
		*/
		
		// (Rounding Numbers)
		
	}
}
