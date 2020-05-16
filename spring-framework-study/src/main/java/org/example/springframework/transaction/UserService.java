package org.example.springframework.transaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ruanwenjun
 * @create 2020/05/15/ 10:06 PM
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	private Log log = LogFactory.getLog(getClass());

	@Transactional(rollbackFor = NumberFormatException.class)
	public void createUser(User user) {
		userDao.createUser(user);
		if (user.getAge() < 0) {
			log.error("Create User failed");
			// throw a exception
			throw new NumberFormatException("User age invalidate");
		}
		log.info("Create User success");
	}
}
