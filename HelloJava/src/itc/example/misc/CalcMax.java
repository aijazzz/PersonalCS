package itc.example.misc;

public class CalcMax {
	
	public static int max(int a, int b) 
	{
		if (a > b)
			return a;
		else
			return b;
	}

	public static int max(int a, int b, int c) 
	{
		if (a > b)
		{
			if (a > c)
				return a;
			else
				return c;
		}			
		else
		{
			if (b > c)
				return b;
			else 
				return c;
		}
	}

	public static double max(double a, double b) 
	{
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) 
	{
		int a = 750, b = 3, c = 391;
		System.out.println("The max of " + a + " and " + b + " is " + max(a, b));
		
		System.out.println("The max of " + a + ", " + b + " and " + c + " is " + max(a, b, c));
		
		double d = 75.4, e = 3.5;
		
		System.out.println("The max of " + d + " and " + e + " is " + max(d, e));

	}

}
