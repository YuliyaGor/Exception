package exception;

public class ArrayStore {

	public void setElement() throws ArrayStoreException {

		try {
			Object x[] = new String[3];
			x[0] = new Integer(8);
		} catch (ArrayStoreException e) {
			throw e;
		}

	}
}
