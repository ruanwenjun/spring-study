package org.example.springframework.bean;

import org.springframework.stereotype.Component;

/**
 * @author ruanwenjun
 * @create 2020/05/11/ 7:40 PM
 */
@Component
public class Cat {

	private String name;

	private Integer age;

	public Cat() {
	}

	public Cat(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
