
public class UniversalTables {

	/**
	 * 
	 * @param x number for which table has to be printed
	 * @param times how many times the table should go
	 */
	public static void tables(int x, int times) {
		System.out.println("Table of " + x);
		for (int i = 1; i <= times; i++) {
			System.out.println(x + " x " + i + " = " + x*i);
		}
		System.out.println("\n");
	}

public static void main(String[] args) {
	int b = 10;
	tables(3, b);
	tables(9, b);
	tables(15, b);

	int times = 10;
	int[] tableList = {3, 9, 15};

	for (int i : tableList) {
		tables(i, times);
	}
}
}

