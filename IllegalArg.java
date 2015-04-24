package exception;

public class IllegalArg{
	
	public void getArea() throws IllegalArgumentException {
		int result = 0;

		try {
			result = getAreaValue(-1, 100);
		} catch (IllegalArgumentException e) {
			System.err
					.println("В метод вычисления площади был передан аргумент с негативным значением!");
			throw e;
		}
		System.out.println("Result is : " + result);
	}

	public static int getAreaValue(int x, int y) {
		if (x < 0 || y < 0)
			throw new IllegalArgumentException(
					"value of 'x' or 'y' is negative: x=" + x + ", y=" + y);
		return x * y;

	}
}

