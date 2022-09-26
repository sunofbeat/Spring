package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect //aspect을 갖고있는 Bean
@Component
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")//..점두개는 n개이상
	private void myPointcut() {}
	
	@Around("myPointcut()") //위 Aspect을 이용한 
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println(("경과시간: " + (end - start)));
		
		result.setResult(result.getResult() + "(clock)");
		return result;
	}
}
