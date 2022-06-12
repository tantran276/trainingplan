package vn.com.tma.trainingplan.designpattern.abstractfactory;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}
