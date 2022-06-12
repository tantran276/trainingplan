package vn.com.tma.trainingplan.designpattern.abstractfactory;

public class HomeLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate = r;
	}
}
