import java.util.Scanner;

public class ReadableNumberGuessingGame {	
	/**
	 * Returns zero if guessedNumber is correct, positive 1 if the guessed 
	 * number is too small and negative 1 if it was too big.
	 * @param guessedNumber Guessed number by computer
	 * @return 0, 1, -1
	 */
	public static int askUser(int guessedNumber, Scanner input) {
        int in, result;
        System.out.println("Is the number " + guessedNumber + "? (0/1)");
        in = input.nextInt();
        if (in == 1) {
            result = 0;
        } else {
            System.out.println("Is the number bigger? (0/1)");
            in = input.nextInt();
            result = (in == 1) ? 1 : -1; 
        }
		return result;
	}
	
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        int lowest = 0, highest = 100, middle = 50, in;
        do {
            middle = calculateNumberAnotherWay(lowest, highest);
            in = askUser(middle, input);
            if (in == 0) {
            	correctGuess = true;
            } else if (in == 1) {
                lowest = middle;
            } else {
                highest  = middle;
            }
        } while (!correctGuess);
        System.out.println("Program completed.");
        input.close();
    }
    public static int calculateNumberAnotherWay(int lowest, int highest) {
    	return 1;
    }
}