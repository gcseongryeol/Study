package _9_28;

public class Person {

// 말하기, 먹기, 걷기, 잠자기

	// Talking call시 -> 자기 이름을 출력하면서 말하기
	// 자기 이름을 적을 수 있는 공간이 필요하다
	// 이름을 객체 생성시 넣어 줘야한다.

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void Talking() {
		System.out.println(name + " 말하기");
	}

	public void Eatting() {
		System.out.println("먹기");
	}

	public void Walking() {
		System.out.println("걷기");
	}

	public void sleep() {
		System.out.println("잠자기");
	}

}
