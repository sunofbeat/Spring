package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component("rifleGun")  //ID를 지정해줄수도 있음 
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}
