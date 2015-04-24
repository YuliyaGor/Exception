package exception;

public class Arithmetic {
	
	private int a;
	private int b;
	
	public Arithmetic(int x, int y) {
		this.a = x;
		this.b = y;
	}
	
	public double div() throws ArithmeticException {
		double result;
		try {
			result = this.a/this.b;
		} catch (ArithmeticException e) {
			result = 0;
			throw e;
		}
		
		return result;
	}
}
