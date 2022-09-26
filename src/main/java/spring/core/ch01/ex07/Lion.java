package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean{
	//spring에서준비된 API상속    Bean객체 초기화	,	Bean객체 소멸
	@Override
	public void afterPropertiesSet() throws Exception {
		//Bean초기화시 코드 구현
		System.out.println("Lion is born.");
	}
	
	public void shout() {
		System.out.println("List shout.");
	}
	
	@Override
	public void destroy() throws Exception {
		//Bean 소멸시 코드 구현
		System.out.println("Lion is dead.");
	}
}
