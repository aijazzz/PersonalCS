package itc.example.misc;

import java.util.Scanner;

public class TableApplication {

	/**
	 * 
	 * Main
			Menu method
				Print menu
				Ask command
			Print Table 
				Take input
				Show table
			Test Single Table
				Take input 
				Take test
				Get Random
			Test Tables
				Get Random
			Exit
	 */
	
	public static int menu() {
		/**
		  	1	Print 			table	print a table
			2	Test a table	ask user a number from 1 to 12 and then take test for that
			3	Full test		take test of all tables from 1 to 12
			4	Exit			exit the program
		 */
		System.out.println("1\tPrint table\t\tPrint a table");
		System.out.println("2\tTest a table\t\tTask user a number from 2 to 12 and then take test for that");
		System.out.println("3\tFull test\t\tTake test of all tables from 2 to 12");
		System.out.println("4\tExit\t\tExit the program\n");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}
	
	public static void tables(int x, int times) {
		System.out.println("Table of " + x);
		for (int i = 1; i <= times; i++) {
			System.out.println(x + " x " + i + " = " + x*i);
		}
		System.out.println("\n");
	}
	public static void printTable() {
		System.out.println("Enter number between 2 to 12 for table: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		tables(input, 10);
	}
	
	public static int getRandom() {
		// 0.56546453654965 * 10 = 5.6546453654965
		int random = 1 + (int)(Math.random() * 10);
		return random;
	}
	public static void testSingleTable() {
		System.out.println("Enter number between 2 to 12 for table test: ");
		Scanner scanner = new Scanner(System.in);
		int table = scanner.nextInt();
		int multiplier = 0;
		int answer = 0;
		
		for (int i = 0; i < 5; i++) {
			multiplier = getRandom();
			
			System.out.println("What is " + table + " x " + multiplier + "? : ");
			answer = scanner.nextInt();
			
			if (answer == table*multiplier) {
				System.out.println("Correct!");
			} else {
				System.out.println("Wrong! "+ table + " x " + multiplier + " is " + table*multiplier);
			}
		}
	}

	public static void testTables() {
		// TODO
		a x b = ?
		a = getRandom();
		b = getRandom();
		
		System.out.println("More testing...");
	}

	public static void main(String[] args) {
		
		int command = 0;
		
		do {
			command = menu();
			
			switch (command) {
			case 1:
				printTable();
				break;
			case 2:
				testSingleTable();
				break;
			case 3:
				testTables();
				break;
			}
			
		} while (command != 4);
		
		System.out.println("Thank you for using our program, bye.");
	}

}
