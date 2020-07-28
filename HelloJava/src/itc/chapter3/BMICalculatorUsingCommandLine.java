package itc.chapter3;

public class BMICalculatorUsingCommandLine {

	/**
	 * This is a BMI calculator which takes two parameters from user at command line 
	 * i.e. Mass in Kilogram and Height in Meter
	 * Program then calculates BMI and shows it the user. 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		float weight, height;
		
		System.out.println("Welcome to BMI Calculator program!\n");
		
		if (args.length == 2)
		{
			weight = Float.parseFloat(args[0]);
			height = Float.parseFloat(args[1]);
		}
		else
		{
			System.out.println("This program works with two parameters,");
			System.out.println("First parameter is mass in kg");
			System.out.println("and second parameter is height in meters.");
			System.out.println("Usage e.g.");
			System.out.println("BMICalculatorUsingCommandLine mass height");
			return;
		}
			
		System.out.println("You provided weight as " + weight + "Kg and height as " + height + "m.");
		
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
	}

}
