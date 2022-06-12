package vn.com.tma.trainingplan.designpattern.decorator;

public class ChineeseFood extends FoodDecorator{

	public ChineeseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String preparedFood() {
		return super.preparedFood() + " With Fried Rice and Manchurian ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 65.0;
	}
	
}
