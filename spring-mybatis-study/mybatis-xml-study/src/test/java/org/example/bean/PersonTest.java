package org.example.bean;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ruanwenjun
 * @create 2020/05/24/ 10:54 PM
 */
public class PersonTest {

	private Logger logger = LogManager.getLogger(getClass());

	@Test
	public void test() throws IOException {
		int id = 1;
		String resource = "config/mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			Person person = session.selectOne("mapper.PersonMapper.selectPerson", id);
			logger.info("person :" + person);
		} finally {
			inputStream.close();
		}
	}
}
