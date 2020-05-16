package org.example.springframework.condition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ruanwenjun
 * @create 2020/05/13/ 5:47 PM
 */
public class Car {

	@Value("car1")
	private String name;

	public Car() {
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
