package exception;

public class NegativeArray {
	public void getElement() throws NegativeArraySizeException{
		
		try {
			int[] arr = new int[-1];
		} catch (NegativeArraySizeException e) {
			throw e;
		}
		
	}
}
