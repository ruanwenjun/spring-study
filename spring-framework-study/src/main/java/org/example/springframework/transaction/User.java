package org.example.springframework.transaction;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 10:06 PM
 */
public class User {

	private String name;
	private Integer age;

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
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
