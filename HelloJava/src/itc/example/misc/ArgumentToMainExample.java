package itc.example.misc;

public class ArgumentToMainExample {

	public static void myFunction(int[] list) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome, here is the list of arguments provided,");
		for (String arg : args) 
		{
			System.out.println("\t" + arg);
		}
		System.out.println("End.");
	}
}
