package org.example.springframework.beanfactory;

/**
 * @author ruanwenjun
 * @create 2020/05/16/ 10:31 PM
 */
public class Car {

	private String name;

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
