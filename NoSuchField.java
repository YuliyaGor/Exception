package exception;

public class NoSuchField {
	
	public void noSuch () throws NoSuchFieldError{
		NullPointer nullPointer = new NullPointer();
		
		try {
			System.out.println(nullPointer.hashCode());
		} catch (NoSuchFieldError e) {
			throw e;
		}
		
	}

}
