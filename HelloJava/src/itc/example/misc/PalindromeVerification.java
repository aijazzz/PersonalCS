package itc.example.misc;

import java.util.Scanner;

public class PalindromeVerification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string to be verified as palindrome: ");
		
		String candidate = scanner.nextLine();
		candidate = candidate.toLowerCase();
		
		int start = 0, end = candidate.length() - 1;
		
		boolean isPalindrome = true;
		
		while (start < end)
		{
			if (candidate.charAt(start) != candidate.charAt(end))
			{
				isPalindrome = false;
				break;
			}
			start++;
			end--;
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
