package day3.exam;

import java.util.Scanner;

public class Ex_Animal {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		// 동물이 들어갈 공간을 배열로 만들고, Moveable [] 타입으로 refer.
		Moveable[] animals = (Moveable[]) new 동물[10];

		// N마리의 호랑이와 M마리의 토끼의 이름을 입력받아 생성합니다.
		int N = input.nextInt();
		String name = null;
		int i = 0;
		for (i = 0; i < N; i++) {
			name = input.next();
			animals[i] = new 호랑이(name);
		}
		int k = i;
		int M = input.nextInt();
		for (i = k; i < k + M; i++) {
			name = input.next();
			animals[i] = new 토끼(name);
		}

		// animals[i]를 이용하여 호랑이와 토끼의 move()를 실행합니다.
		for (i = 0; i < N + M; i++) {
			animals[i].move();
		}
	}
}

//아래 인터페이스와 클래스의 코드를 잘읽고
//필요한 부분을 추가하여 완성합니다.
interface Moveable {
	public void move();
}

class 동물 implements Moveable {
	private String name;

	public 동물() {
	}

	public 동물(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}
}

class 호랑이 extends 동물 {
	// 생성자를 완성하세요
	String name;

	public 호랑이(String name) {
		this.setName(name);
	}

	public void move() {
		System.out.println(this.getName() + " : 숲속에서 어슬렁 어슬렁 움직입니다");
	}

}

class 토끼 extends 동물 {
	// 생성자를 완성하세요

	public 토끼(String name) {
		this.setName(name);
	}

	public void move() {
		System.out.println(this.getName() + " : 숲속 여기저기를 폴짝폴짝 뛰어다니며 놉니다~");
	}

}
