package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol; //타입이 Gun이면서 아이디가 pistol인 Bean을 DI한다
	//@Autowired private Gun rifle; //중복에러
	@Autowired @Nullable private Gun rifleGun; //2차적용할때는 1차가 먼저 적용이 되어야하고 rifle(Gun)을 붙여주면서 중복을 제거한다
	
	public void fire() {
		try {
			pistol.fire();
			//rifle.fire(); //에러
			rifleGun.fire();
		} catch(NullPointerException e) {}
	}
}
