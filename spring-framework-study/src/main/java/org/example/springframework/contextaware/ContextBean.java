package org.example.springframework.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现该接口可以在Bean中注入容器
 * 该接口的实现原理是{@link org.springframework.context.support.ApplicationContextAwareProcessor}后置处理器
 *
 * 从Spring2.5+开始后，可以直接通过@Autowared注解注入ApplicationContext，而不需要实现该接口了
 * @author ruanwenjun
 * @create 2020/05/14/ 11:39 AM
 *
 */
public class ContextBean implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public String toString() {
		return "ContextBean{" +
				"applicationContext=" + applicationContext +
				'}';
	}
}
