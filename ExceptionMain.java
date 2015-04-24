package exception;

import java.io.*;

import fractionNumber.FractionNumberOperation;

public class ExceptionMain {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		// //////////ArithmeticException//////////////
		Arithmetic arithmetic = new Arithmetic(5, 0);
		try {
			arithmetic.div();
		} catch (ArithmeticException e) {
			System.err.println("Деление на нуль");
		}

		// //////////NullPointerException//////////////
		NullPointer frOper = new NullPointer();
		nedis.study.interfaces.t2.core.FractionNumber frNumAdd;

		try {
			frNumAdd = frOper.add(null, null);
		} catch (NullPointerException e) {
			System.err.println("Null при операции сложения FractionNumber");
		}

		// //////////ArrayIndexOutOfBoundsException//////////////
		ArrayIndex arrayIndex = new ArrayIndex();
		int[] mas = { 1, 55, 3, 4 };
		int elem4;
		try {
			elem4 = arrayIndex.getElement(mas, 4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err
					.println("Выход индекса за пределы массива! Длинна массива = "
							+ mas.length);
		}

		// //////////ArrayStoreException//////////////
		ArrayStore arrayStore = new ArrayStore();
		try {
			arrayStore.setElement();
		} catch (ArrayStoreException e) {
			System.err
					.println("Присваивание элементу массива объекта несовместимого типа");
		}

		// //////////NegativeArraySizeException//////////////
		NegativeArray negativeArray = new NegativeArray();

		try {
			negativeArray.getElement();
		} catch (NegativeArraySizeException e) {
			System.err.println("Создание массива отрицательного размера!");
		}

		// //////////FileNotFoundException//////////////
		FileNotFound fileNotFound = new FileNotFound();
		String name = "test.txt";
		try {
			fileNotFound.newFile(name);
		} catch (FileNotFoundException e) {
			System.err.println("Файл с именем: <" + name + "> не найден!!!");
		} catch (IOException e) {
			System.err.println("Файл с именем: <" + name + "> найден, но не доступен!!!");
		}
				
		// //////////IllegalArgumentException//////////////
		IllegalArg illegalArg = new IllegalArg();
		illegalArg.getArea();
		
	}

}
