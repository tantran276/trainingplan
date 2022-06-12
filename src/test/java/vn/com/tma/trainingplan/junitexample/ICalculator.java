package vn.com.tma.trainingplan.junitexample;

public interface ICalculator {
	int sum(int a, int b);
	int substraction(int a, int b);
	int multiplication(int a, int b);
	int division(int a, int b) throws Exception;
	boolean equalIntegers(int a, int b);
}
