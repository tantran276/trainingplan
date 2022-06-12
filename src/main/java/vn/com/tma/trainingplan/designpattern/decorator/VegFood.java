package vn.com.tma.trainingplan.designpattern.decorator;

public class VegFood implements Food{

	@Override
	public String preparedFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}

}
