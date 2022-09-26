package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter  //setter를 만들어줌 
@NoArgsConstructor //파라미터가 없는 생성자
@AllArgsConstructor //파라미터가 있는 생성자
public class Shooter {
	private String name;
	private Gun gun;
	
	public void fire() {
		System.out.print(name + ": ");
		gun.fire();
	}
}
