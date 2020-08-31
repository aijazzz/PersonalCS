package itc.example.misc;

public class TwoDRectangle {

	public static void main(String[] args) {
		
		int x1= 10, y1= 10, l1= 10, h1= 10;
		int x2= 20, y2= 20, l2= 20, h2= 20;
		int x3= 30, y3= 30, l3= 30, h3= 30;
		
		drawRectangle(x1, y1, l1, h1);
		drawRectangle(x2, y2, l2, h2);
		drawRectangle(x3, y3, l3, h3);
	}
	
	public static void drawRectangle(int x, int y, int l, int h) 
	{
		drawLine(x, y, x+l, y);
		drawLine(x, y, x, y+h);
		drawLine(x, y+h, x+l, y+h);
		drawLine(x+l, y, x+l, y+h);
	}
	
	public static void drawLine(int x1, int y1, int x2, int y2)
	{
		
	}

}
