package org.example.springframework.config;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.springframework.bean.Cat;
import org.example.springframework.processor.BeanPostProcessorConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ruanwenjun
 * @create 2020/05/11/ 7:42 PM
 */
public class ConfigTest {


	private Log log = LogFactory.getLog(getClass());

	@Test
	public void test1() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorConfig.class);
		System.out.println("context load success........");
		Cat cat = (Cat) applicationContext.getBean("cat");
		System.out.println(cat);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}

	}

}