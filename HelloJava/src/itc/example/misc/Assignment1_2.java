package itc.example.misc;

public class Assignment1_2 {

	public static double run(double celsius) {
		double fahrenheit = 9.0 / 5 * celsius + 32.0;
		
		
		return fahrenheit;				
	}

	public static void main(String[] args)
	{
		double c = 45.5, f;
		System.out.println("The celcius value : " + c);
		f = run(c);
		System.out.println("Converted Fahrenheit value: " + f);
	}
}
