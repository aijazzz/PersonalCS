package itc.chapter3;

import java.util.Scanner;

public class BMICalculator {

	/**
	 * This is a BMI calculator which takes two parameters from user i.e. Mass in Kilogram and Height in Meter
	 * Program then calculates BMI and shows it the user. 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to BMI Calculator program!\n");
		System.out.print("Enter your weight in Kilograms : ");
			
		float weight = scanner.nextFloat();
		
		System.out.println("Enter your height in Meters : ");
		
		float height = scanner.nextFloat();
		
		System.out.println("You entered weight as " + weight + "Kg and height as " + height + "m.");
		
		float bmi = weight / (height * height);	// weight / (square_of_height)
		
		if (bmi > 18.5 && bmi < 24.5)
		{
			System.out.println("\nYour calculated BMI is " + bmi + ", Congratulations!");
		} 
		else if (bmi < 18.5)
		{
			System.out.println("\nYour calculated BMI is " + bmi + ", Eat proper and gain some wight!");
		} 
		else if (bmi > 24.5)
		{
			System.out.println("\nYour calculated BMI is " + bmi + ", Be careful on diet and exercise more!");
		}		
		
		scanner.close();
	}

}
