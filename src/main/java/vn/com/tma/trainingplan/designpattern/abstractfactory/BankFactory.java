package vn.com.tma.trainingplan.designpattern.abstractfactory;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if(bank == null) {
			return null;
		}
		if(bank.equals("HDFC")) {
			return new HDFC();
		} else if(bank.equals("ICICI")) {
			return new ICICI();
		} else if(bank.equals("SBI")) {
			return new SBI();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}
}
