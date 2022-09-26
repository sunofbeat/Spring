package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //aspect은 advice
@Component
public class Timer {
	@Before("execution(* spring..*(int))")//파라미터가 int인 메서드
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각: " + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)") //메서드 관점 + 클래스 관점으로 서술한다.
				//spring 으로 시작하고 Calculator로 시작하는 클래스 안에 있는 메서드
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	
	@AfterReturning(pointcut="bean(calc*)", returning="result") //joinpoint가 성공했는지 알수있는 @
						//bean의메서드중 calc~로 시작하는 메서드 returning은 리턴값에 붙이는 이름
	public void printResult(JoinPoint jp, int result) {
		System.out.println(jp.toShortString() + ": " + result);
	}
}
