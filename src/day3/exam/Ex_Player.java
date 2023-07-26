package day3.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_Player {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<Player> ps = new ArrayList<Player>();
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			String name = input.next();
			int hp = input.nextInt();
			ps.add(new Player(name, hp));
		}
		View v = new View(ps);
		v.showPlayers();
	}
}

//Player클래스는 만들어져 있음
class Player {
	String name;
	int hp;

	public Player(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}

///////////////////////////////////////////////////
//시작
class Bar {
	private int value;

	// 필요한 메소드 정의
	// 힌트:private 변수를 위한 getter, setter를 추가한다.

	public void showBar() {

		for (int i = 0; i < value; i++)
			System.out.print("#");
		System.out.println();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

///////////////////////////////////////////////////////////////
class View {
	// 필요한 필드를 정의한다. 힌트 : Player들과 Bar들.
	List<Player> ps;
	List<Bar> bs = new ArrayList<Bar>();

	// 필요한 생성자 정의 : "Player들"의 정보를 전달받아야 합니다.
	public View(List<Player> ps) {
		//
		// Player 수만큼 Bar를 만들고 해당 Player의 hp를 Bar의 value로 setting한다. Bar리스트에 추가한다.
		// for(int i=0; i<ps.size(); i++){ }도 가능
		this.ps = ps;
		for (Player p : ps) {
			Bar bar = new Bar();
			bar.setValue(p.getHp());
			bs.add(bar);
		}
	}

	public void showPlayers() {

		System.out.println("==========  Players status  ==========");
		for (int i = 0; i < this.ps.size(); i++) {
			System.out.printf("[%2d] %10s : ", i + 1, this.ps.get(i).name);

			// 해당 Player의 hp값만큼 Bar를 출력하도록 하는 코드 "한 줄"을 작성한다. "Bar들"의 정보와 기능을 한다.
			bs.get(i).showBar();
		}
		System.out.println("======================================");
	}
}
///////////////////////////////////////////////////