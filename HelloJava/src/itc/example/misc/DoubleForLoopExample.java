package itc.example.misc;

import java.util.Scanner;

public class DoubleForLoopExample {

	/**
	 * 	
	**********
	*********
	********
	*******
	******
	*****
	****
	***
	**
	*
	 */
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter starting number of stars: ");
		
		int stars = scanner.nextInt();
		int remainingStars = stars;

		for (int i = 0; i < stars; i++)
		{
			for (int j = 0; j < remainingStars; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			remainingStars -= 1; // remainingStars = remainingStars - 1 
		}		
	}

}
