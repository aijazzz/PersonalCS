import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		int decValue = hexToDecimal(hex.toUpperCase());
		System.out.println("The decimal value for hex number " + hex + " is " + decValue);
		input.close();
	}

	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		int number = 0;	
		for (int i = hex.length()-1, j=0; i >= 0; i--,j++) {
			char hexChar = hex.charAt(i);
			double placeValue = Math.pow(16, j);
			number += ( placeValue * hexCharToDecimal(hexChar));			
		}
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		System.out.println("Number is "+ number);
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1', ..., or '9'
			return ch - '0';
	}
}