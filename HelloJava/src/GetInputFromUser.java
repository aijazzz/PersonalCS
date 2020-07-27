import java.util.Scanner;

class GetInputFromUser
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, do you want to proceed y/n,");
        String s = in.nextLine();
        if (s.equals("y")) 
        {
        	System.out.println("You wanted to proceed.");
        } else {
        	System.out.println("You wanted to abort.");
        }        
    }
}