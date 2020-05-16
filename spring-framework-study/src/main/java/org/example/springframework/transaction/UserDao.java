package org.example.springframework.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 10:05 PM
 */
@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createUser(User user){
		String sql = "INSERT INTO user(name, age) VALUES (?,?)";
		jdbcTemplate.update(sql, user.getName(), user.getAge());
	}
}
