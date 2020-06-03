package org.example.mapper;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.bean.Person;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/05/25/ 2:25 PM
 */
public class PersonMapperTest {

	private Logger logger = LogManager.getLogger(getClass());

	private String resource = "config/mybatis-conf.xml";

	@Test
	public void testGetPersonById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			Person person = personMapper.getPersonById(2);
			logger.info("person:" + person);
		} finally {
			inputStream.close();
		}
	}

	@Test
	public void testGetPersonByNameAndEmail() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			Person person = personMapper.getPersonByNameAndEmail("zhangsan", "zhangsan@gmail.com");
			logger.info("person:" + person);
		} finally {
			inputStream.close();
		}
	}


	@Test
	public void testAddPerson() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			Person person = new Person(null, "zhangsan", "zhangsan@gmail.com", 1);
			final boolean b = personMapper.addPerson(person);
			logger.info("person:" + person);
			sqlSession.commit();
			logger.info("result=:" + b);
		} finally {
			inputStream.close();
		}
	}

	@Test
	public void testDeletePersonById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			final Integer integer = personMapper.deletePersonById(1);
			sqlSession.commit();
			logger.info("result=:" + integer);
		} finally {
			inputStream.close();
		}
	}

	@Test
	public void testUpdatePersonById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			Person person = new Person(3, "zhangsan02", "zhangsan02@gmail.com", 1);
			final Integer integer = personMapper.updatePersonById(person);
			sqlSession.commit();
			logger.info("result=:" + integer);
		} finally {
			inputStream.close();
		}
	}


}
