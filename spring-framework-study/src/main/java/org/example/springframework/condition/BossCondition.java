package org.example.springframework.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ruanwenjun
 * @create 2020/05/13/ 5:50 PM
 */
public class BossCondition implements Condition {

	/**
	 * if there is a car then load boss
	 * 这里如果Bean是使用Component加载的话，这里是看不到bean，只有在config里面加载才看的到，暂时还不清
	 * 楚原因。。。。。。。
	 *
	 * @param context
	 * @param metadata
	 * @return
	 */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getRegistry().containsBeanDefinition("car");
	}
}
