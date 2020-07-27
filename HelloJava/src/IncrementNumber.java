
public class IncrementNumber {

	public static void main(String[] args) {
		int x = 15;
		System.out.println("Before the call, x is " + x);
		increment(x);
		System.out.println("After the call, x is " + x);
	}

	public static void increment(int n) {
		n++;
		System.out.println("Inside the method is " + n);
	}

}
