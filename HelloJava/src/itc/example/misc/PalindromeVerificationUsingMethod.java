package itc.example.misc;

import java.util.Scanner;

public class PalindromeVerificationUsingMethod {

	public static boolean verifyPalindromePart(String pal) 
	{
		if (pal.charAt(0) != pal.charAt(pal.length()-1))
		{
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string to be verified as palindrome: ");
		
		String candidate = scanner.nextLine();
		candidate = candidate.toLowerCase();
		
		int length = candidate.length();
				
		boolean isPalindrome = true;
		
		for (int i = 0; i < length/2; i++)
		{
			String part = candidate.substring(i, length-i);
			if (!verifyPalindromePart(part)) 
			{
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome)
		{
			System.out.println("Entered string is indeed a palindrome.");
		}
		else
		{
			System.out.println("Entered string is not a palindrome.");
		}
	}

}
