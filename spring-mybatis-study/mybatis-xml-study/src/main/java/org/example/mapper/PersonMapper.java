package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.bean.Person;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/05/25/ 2:23 PM
 */
public interface PersonMapper {

	/**
	 * @param person
	 * @return
	 */
	boolean addPerson(Person person);

	/**
	 * @param id
	 * @return
	 */
	Integer deletePersonById(Integer id);

	/**
	 * @param integer
	 * @return
	 */
	Person getPersonById(Integer integer);

	/**
	 * @param name
	 * @param email
	 * @return
	 */
	Person getPersonByNameAndEmail(@Param("name") String name, @Param("email") String email);

	/**
	 * @param person
	 * @return
	 */
	Integer updatePersonById(Person person);


}
