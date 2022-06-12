package vn.com.tma.trainingplan.designpattern.decorator;

public class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String preparedFood() {
		return super.preparedFood() + " Within Roasted Chiken and Chiken Curry ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
	
}
