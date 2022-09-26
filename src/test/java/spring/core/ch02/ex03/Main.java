package spring.core.ch02.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		calculator.calc(1);
	}
//Before -> AfterReturning -> After순으로 실행됨
}
