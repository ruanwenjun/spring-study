package org.example.springframework.condition;

import org.example.springframework.condition.BossCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;

/**
 * @author ruanwenjun
 * @create 2020/05/13/ 5:47 PM
 */
@Conditional(value = BossCondition.class)
public class Boss {


	@Value("boss1")
	private String name;

	public Boss() {
	}

	@Override
	public String toString() {
		return "Boss{" +
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
