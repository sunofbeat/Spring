package spring.core.ch02.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private final Logger logger;
	
	public MyLogger() {
		logger = LogManager.getLogger(MyLogger.class);
	}
	
	@After("@annotation(spring.core.ch02.ex04.Log)")
	public void log(JoinPoint jp) {
		logger.info(jp.toShortString());
		//정상흐름의 메세지
	}
	
	@AfterThrowing(pointcut="@annotation(spring.core.ch02.ex04.Log)", throwing="ex")
	public void logError(JoinPoint jp, Throwable ex) {
		logger.error(jp.toLongString() + ": " + ex.getMessage());
		//Exception이 발생했을때 나오게될 메세지
	}
	
}	
