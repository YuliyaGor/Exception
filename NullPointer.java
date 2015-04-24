package exception;

import nedis.study.interfaces.t2.core.FractionNumber;

public class NullPointer {
	
	public FractionNumber add(FractionNumber x, FractionNumber y)
			throws NullPointerException {

		int divident;
		int divisor;

		try {

			divident = x.getDividend() * y.getDivisor() + y.getDividend() * x.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		try {

			divisor = x.getDivisor() * y.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		FractionNumber fractionAdd = new fractionNumber.FractionNumber(
				divident, divisor);
		return fractionAdd;
	}

}
