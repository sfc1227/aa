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

//PlayerŬ������ ������� ����
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
//����
class Bar {
	private int value;

	// �ʿ��� �޼ҵ� ����
	// ��Ʈ:private ������ ���� getter, setter�� �߰��Ѵ�.

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
	// �ʿ��� �ʵ带 �����Ѵ�. ��Ʈ : Player��� Bar��.
	List<Player> ps;
	List<Bar> bs = new ArrayList<Bar>();

	// �ʿ��� ������ ���� : "Player��"�� ������ ���޹޾ƾ� �մϴ�.
	public View(List<Player> ps) {
		//
		// Player ����ŭ Bar�� ����� �ش� Player�� hp�� Bar�� value�� setting�Ѵ�. Bar����Ʈ�� �߰��Ѵ�.
		// for(int i=0; i<ps.size(); i++){ }�� ����
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

			// �ش� Player�� hp����ŭ Bar�� ����ϵ��� �ϴ� �ڵ� "�� ��"�� �ۼ��Ѵ�. "Bar��"�� ������ ����� �Ѵ�.
			bs.get(i).showBar();
		}
		System.out.println("======================================");
	}
}
///////////////////////////////////////////////////