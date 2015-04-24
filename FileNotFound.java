package exception;

import java.io.*;

public class FileNotFound {

	public void newFile (String fileName) throws FileNotFoundException, IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			throw ex;
		} catch (IOException e) {
			throw e;
		}
	}
}
