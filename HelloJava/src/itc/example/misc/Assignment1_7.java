package itc.example.misc;

public class Assignment1_7 {
	
	public static double max(double x, double y) {
		
		if(x >= y) {
			return x; 
		} else {
			return y;
		}
	}
	
	
	public static double abs(double x) {
		if(x < 0) {
			return  -1 * (x);
		} else {
			return x;
		}
	}
	
	
	public static double squared(double x) {
		return x * x;
	}
	
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(abs((x2 - x1) * (x2 - x1)) + abs((y2 - y1) * (y2 - y1)));
	}

}
