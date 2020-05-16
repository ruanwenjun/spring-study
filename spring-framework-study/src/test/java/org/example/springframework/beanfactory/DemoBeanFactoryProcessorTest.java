package org.example.springframework.beanfactory;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ruanwenjun
 * @create 2020/05/16/ 10:33 PM
 */
public class DemoBeanFactoryProcessorTest {

	@Test
	public void postProcessBeanFactory(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);

		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
	}

}