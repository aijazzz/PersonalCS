package itc.example.misc;

import java.util.Scanner;

public class HexadecimalToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Hex string to convert into decimal: ");
		String hex = scanner.nextLine(); // D2F7
		hex = hex.toUpperCase();
		
		// h2 * 16^2 + h1 * 16^1 + h0 * 16^0
		double decNum = 0;
		
		for (int i = 0, j=hex.length()-1; i < hex.length(); i++,j--)
		{
			// each iteration of this loop solves one hex digit
			char hexChar = hex.charAt(i);
			int hexDigit = 0;
			if (hexChar >= '0' && hexChar <= '9') 
			{
				hexDigit = hexChar - 0x30;
			}
			else if (hexChar >= 'A' && hexChar <= 'F')
			{
				hexDigit = (hexChar - 0x41) + 10;
			} 
			else
			{
				System.out.println("Invalid entry, exiting.");
				return;
			}
			
			double placeValue = Math.pow(16, j);
			decNum = decNum + hexDigit * placeValue;
		}
		System.out.println("The decimal number is " + decNum);
	}

}
