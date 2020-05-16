package org.example.springframework.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * This aspect is add to OrderService
 *
 * @author ruanwenjun
 * @create 2020/05/14/ 5:04 PM
 */
@Aspect
public class OrderServiceAspect {

	private Log log = LogFactory.getLog(getClass());

	@Pointcut(value = "execution(* org.example.springframework.aop.OrderServiceImpl.*(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		log.info("before call service");
	}

	@After("pointCut()")
	public void after() {
		log.info("after call service");
	}

	@AfterReturning("pointCut()")
	public void success() {
		log.info("success call service");
	}


	@AfterThrowing("pointCut()")
	public void error() {
		log.error("");
	}


}
