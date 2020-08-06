package itc.example.misc;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		double[] input = new double[8];
		
		System.out.println("Give me 8 numbers to sort,");
		for(int i = 0; i < input.length; i++)
		{
			input[i] = scanner.nextDouble();
		}
		
		System.out.println("Here is the unordered list,");
		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + ", ");
		}
		selectionSort(input);
		System.out.println("\nHere is the ordered list,");
		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + ", ");
		}
	}
	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {

			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}