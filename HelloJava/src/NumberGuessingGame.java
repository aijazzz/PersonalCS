import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        int lowest = 0, highest = 100, middle = 50, in;
        do {
            middle = (lowest + highest) / 2;
            System.out.println("Is the number " + middle + "? (0/1)");
            in = input.nextInt();
            if (in == 1) {
                correctGuess = true;
            } else {
                System.out.println("Is the number bigger? (0/1)");
                in = input.nextInt();
                if (in == 1) {
                    lowest = middle;
                } else {
                    highest  = middle;
                }
            }
        } while (!correctGuess);
        System.out.println("Program completed.");
        input.close();
    }
}