package org.example.springframework.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author ruanwenjun
 * @create 2020/05/16/ 10:23 PM
 */
@Component
public class DemoBeanFactoryProcessor implements BeanFactoryPostProcessor {

	/**
	 * 当BeanDefinition被加载之后，该后置处理器会被调用，可以用来修改Bean的属性，或者对工厂做一些其他的操作
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition car = beanFactory.getBeanDefinition("car");
		// 替换car的名字
		car.getPropertyValues().add("name", "BMW");
	}
}
