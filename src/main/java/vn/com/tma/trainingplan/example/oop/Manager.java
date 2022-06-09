package vn.com.tma.trainingplan.example.oop;

public class Manager extends People implements IWork {
	private long salary;
	
	public Manager(String name, int age, Enum<gender> gender, long salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void mailCheck() {
		System.out.println("Within mailCheck of Manager class");
		System.out.println("Mailing check to " + getName() + " with salary " 
				+ salary);
	}

	@Override
	public void work() {
		System.out.println("Manager is working");
	}
	
	
}
