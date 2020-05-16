package org.example.springframework.contextaware;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ruanwenjun
 * @create 2020/05/14/ 11:48 AM
 */

public class ApplicationContextAwareConfigTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextAwareConfig.class);

		System.out.println(applicationContext);
		ContextBean bean = applicationContext.getBean(ContextBean.class);
		System.out.println(bean);

	}
}
