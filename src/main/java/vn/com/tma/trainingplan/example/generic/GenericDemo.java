package vn.com.tma.trainingplan.example.generic;

import vn.com.tma.trainingplan.example.oop.Employee;
import vn.com.tma.trainingplan.example.oop.People.gender;

public class GenericDemo {
	public static void main(String[] args) {
		Test<Integer> iObj = new Test<Integer>(14);
		System.out.println(iObj.getObj());
		Test<Employee> eObj = new Test<Employee>(new Employee("B", 22, gender.FEMALE, 500));
		eObj.getObj().print();
	}
}

class Test<T> {
	T obj;

	public Test(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}