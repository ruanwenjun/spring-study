package org.example.orderprovider;

import org.example.orderprovider.config.DubboConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author ruanwenjun
 * @create 2020/05/18/ 9:06 PM
 */
public class OrderProviderApplication {

	private static Logger log = LoggerFactory.getLogger(OrderProviderApplication.class);

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DubboConfig.class);
		applicationContext.start();
		log.info("Context start.....");
		System.in.read();
	}
}
