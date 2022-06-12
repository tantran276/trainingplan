package vn.com.tma.trainingplan.junitexample;

public class Calculator implements ICalculator{

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int substraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) throws Exception {
		if(b == 0) {
			throw new Exception("Divider can't be zero");
		}
		return a / b;
	}

	@Override
	public boolean equalIntegers(int a, int b) {
		return a == b;
	}

}
