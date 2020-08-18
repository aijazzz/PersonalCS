package itc.example.misc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		final String add = "add";
		final String sub = "sub";
		final String mul = "mul";
		final String div = "div";
		final String pow = "pow";
		final String sin = "sin";
		Scanner reader = new Scanner (System.in);
		double result;

		System.out.println("Enter your desired operation: ");
		
		String operation = reader.next();
		
		// add, sub, mul, div, sin, cos, tan, pow
		
		
		switch(operation)
		{
		case add:
			
			System.out.println("Enter two numbers : ");
			
			double a = reader.nextDouble();		
			double b = reader.nextDouble();	
			
			result = a+b;
			break;
			
		case sub:
			System.out.println("Enter two numbers : ");
			
			double a1 = reader.nextDouble();		
			double b1 = reader.nextDouble();	
			
			result = a1-b1;
			break;
		
		case sin:
			System.out.println("Enter a number : ");
			double x = reader.nextDouble();		
			result = Math.sin(x);
			break;
	default:
            System.out.printf("Error: The system only supports +,-,* and division!");
            return;
		}
		
		System.out.println("The result is " + result);

		

		
	
	}
}
