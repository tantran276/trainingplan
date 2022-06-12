package vn.com.tma.trainingplan.designpattern.abstractfactory;

public class EducationLoan extends Loan{
	
	@Override
	void getInterestRate(double r) {
		rate = r;
	}
}
