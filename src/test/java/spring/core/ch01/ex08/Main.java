package spring.core.ch01.ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Lion lion1 = ctx.getBean(Lion.class);
		Lion lion2 = ctx.getBean(Lion.class);
		
		Leopard leopard1 = ctx.getBean(Leopard.class);
		Leopard leopard2 = ctx.getBean(Leopard.class);
		
		Lapin lapin1 = ctx.getBean(Lapin.class);				
		Lapin lapin2 = ctx.getBean(Lapin.class);				
		
		System.out.println("Lion: " + (lion1 == lion2));
		//true(singleton)   하나의 Bean을 계속 return해주고 있다
		
		System.out.println("Leopard: " + (leopard1 == leopard2));
		//true(singleton)
		
		System.out.println("Lapin: " + (lapin1 == lapin2));
		//false(Scope("Prototype")  scope을 지정해주면 매번 다른 객체를 생성해준다
	}
}
