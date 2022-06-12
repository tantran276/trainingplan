package vn.com.tma.trainingplan.designpattern.decorator;

public abstract class FoodDecorator implements Food{
	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String preparedFood() {
		return newFood.preparedFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}
}
