package day3.exam.hunter;

import java.util.Scanner;

public class Ex_Hunter {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		숲속 forest = 숲속.getInstance();
		forest.animals = new 동물[10]; // 기본 10마리 공간 생성.

		String name = null;
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			name = input.next();
			if (name.equals("토끼"))
				forest.animals[i] = new 토끼(name);
			if (name.equals("양"))
				forest.animals[i] = new 양(name);
			if (name.equals("원숭이"))
				forest.animals[i] = new 원숭이(name);
		}

		// 숲속에 있는 동물들 보이기
		forest.show();

		// 사냥꾼과 사냥개 생성.
		Huntable h1 = new 사냥꾼();
		Huntable h2 = new 사냥개();
		System.out.println(">>사냥꾼과 사냥개가 사냥을 시작합니다.");
		while (true) {
			if (숲속.numOfanimals == 1) {
				System.out.println("사냥불가");
				break;
			}
			h1.hunt(forest.animals);
			h2.hunt(forest.animals);
		}
		forest.show();

	}

}

//Huntable 인터페이스 : 아래 부분코드를 이용하여 사냥하기 메소드 구현을 완성하세요.
interface Huntable {
	public default void hunt(동물[] animals) {
		if (숲속.numOfanimals == 1) {
			System.out.printf("숲속에 %s만 남았습니다. 사냥을 중단합니다.\n", animals[0].getName());
			return;
		}

		// 사냥동작을 구현합니다. 배열의 첫번째 동물이 사냥감이 되고
		// 첫번째 빈공간은 맨 뒤의 동물로 대체합니다.
		동물 사냥감 = animals[0];
		animals[0] = animals[숲속.numOfanimals - 1];
		숲속.numOfanimals--;
		System.out.printf("%s 사냥성공! \n", 사냥감.getName()); // 사냥성공 메시지

	}
}

//숲속 클래스 : 숲속은 한 개의 instance만 가질 수 있으며 동물배열공간, numOfnaimals을 가지고 있습니다.
//static , non-static멤버를 이용하여 숲속 클래스를 완성하세요

class 숲속 {

	static int numOfanimals = 0;
	static 숲속 instance = null;
	동물[] animals;

	private 숲속() {

	}

	public static 숲속 getInstance() {
		if (instance == null) {
			instance = new 숲속();
		}
		return instance;
	}

	// 숲속에 있는 동물을 출력합니다.
	public void show() {
		System.out.printf("==숲속에 살고 있는 동물 : 총 %d 마리==\n", 숲속.numOfanimals);
		for (int i = 0; i < 숲속.numOfanimals; i++) {
			System.out.print(animals[i].getName() + " ");
		}
		System.out.println();
	}
}

///////////////////////////////////////////////
//테스트 코드를 잘 읽고 동물클래스와 토끼, 양, 원숭이 클래스를 완성하세요
class 동물 {
	private String name;

	public 동물() {
		숲속.numOfanimals++;
	}

	public 동물(String name) {
		this();
		this.name = name + 숲속.numOfanimals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class 토끼 extends 동물 {

	public 토끼(String name) {
		super(name);
	}

	public void 뛰기() {
	}
}

class 양 extends 동물 {

	public 양(String name) {
		super(name);
	}

	public void 도망가기() {
	}
}

class 원숭이 extends 동물 {

	public 원숭이(String name) {
		super(name);
	}

	public void 나무타기() {
	}
}

//테스트 코드를 잘 읽고 사냥꾼과 사냥개 클래스를 완성하세요
class 사냥꾼 implements Huntable {

}

class 사냥개 extends 동물 implements Huntable {

}
