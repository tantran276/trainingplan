package vn.com.tma.trainingplan.example.oop;

import java.util.Comparator;

public abstract class People implements Comparator<People>, Comparable<People> {
	public enum gender {
		MALE, FEMALE
	};

	private String name;
	private int age;
	private Enum<gender> gender;

	public People() {
		super();
	}

	public People(String name, int age, Enum<gender> gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Enum<gender> getGender() {
		return gender;
	}

	public void setGender(Enum<gender> gender) {
		this.gender = gender;
	}

	public void mailCheck() {
		System.out.println("Within mailCheck of Employee class");
		System.out.println("Mailing a check to " + this.name + " " + this.age + " ages");
	}

	public void print() {
		System.out.println("Name: " + name + ", age: " + age + ", gender: " + gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof People) {
			People p = (People) obj;
			return p.name.equals(this.name);
		}
		return false;
	}

	@Override
	public int compareTo(People o) {
		return (this.name).compareTo(o.name);
	}

	@Override
	public int compare(People o1, People o2) {
		return (o1.name).compareTo(o2.name);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}
