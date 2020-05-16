package org.example.springframework.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 10:28 PM
 */
public class UserServiceTest {

	private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);
	private UserService userService = applicationContext.getBean(UserService.class);

	@Test
	public void createUser() {
		User tom = new User("Tom", 18);
		userService.createUser(tom);
	}

	@Test
	public void createUserWithRollback(){
		User tom = new User("Tom", -1);
		userService.createUser(tom);
	}
}