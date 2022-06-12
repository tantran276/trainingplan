package vn.com.tma.trainingplan.designpattern.abstractfactory;

public class HDFC implements Bank{
	private final String BNAME;
	
	public HDFC() {
		BNAME = "HDFC BANK";
	}

	@Override
	public String getName() {
		return BNAME;
	}
}
