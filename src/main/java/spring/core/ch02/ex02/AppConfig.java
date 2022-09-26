package spring.core.ch02.ex02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
@EnableAspectJAutoProxy //추가시 AOP를 처리할수있는 Bean을 컨테이너에 준비해준다
						//추가해주지않는다면 Pointcut, Around같은 어노테이션은 쓰레기 코드가됨
public class AppConfig {

}
