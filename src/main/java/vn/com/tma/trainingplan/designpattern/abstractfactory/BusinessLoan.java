package vn.com.tma.trainingplan.designpattern.abstractfactory;

public class BusinessLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate = r;
	}
}
