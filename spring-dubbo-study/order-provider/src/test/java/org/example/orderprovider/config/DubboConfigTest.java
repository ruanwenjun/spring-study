package org.example.orderprovider.config;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author ruanwenjun
 * @create 2020/05/18/ 8:10 PM
 */
public class DubboConfigTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DubboConfig.class);
		applicationContext.start();
	}

}
