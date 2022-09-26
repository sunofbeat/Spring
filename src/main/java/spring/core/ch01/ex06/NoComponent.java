package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NoComponent {

}
/**
 * 과제
 * class 에 적용하고, bean상태에서 살아남아 있는 annotation을 만들어라 
 */

