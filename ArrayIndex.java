package exception;

public class ArrayIndex {

	public int getElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
		int result;
		
		try {
			result = arr[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			result = 0;
			throw e;
		}
		
		return result;
	}
}
