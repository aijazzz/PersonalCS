package itc.chapter6;

import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = 1800, month = 1;
		// Take user input
		System.out.println("Enter ...");
		// TODO: Complete user input
		
		printMonth(year, month);
	}
	
	public static void printMonth(int year, int month) {
		
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	public static int getNumberOfDaysInMonth(int year, int month) {
		int days = 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			days = 30;
		}
		else if (month == 2) 
		{
			if (isLeapYear(year))
			{
				days = 29;
			}
			else
			{
				days = 28;
			}
		}
		return days;
	}
	public static boolean isLeapYear(int year) {
		boolean leap = false;
		if (year / 4 == 0) {
			leap = true;
		}
		return leap;
	}
	public static int getTotalNumberOfDays(int year, int month) {
		isLeapYear(year);
		// FIXME: implement this 
		return 2563;
	}
		
	public static int getStartDay(int year, int month) {		
		// FIXME: implement real function
		return 0;
	}
	public static void printMonthBody(int year, int month) {
		int day = getStartDay(year, month);
		int daysInMonth = getNumberOfDaysInMonth(year, month);
		// TODO:
		// printMonth
	}
	
	public static void printMonthTitle(int year, int month) {
		System.out.print("     " + month + " " + year);
		System.out.println("-----------------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}

}
