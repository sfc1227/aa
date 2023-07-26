package day3.exam;

import java.util.Scanner;

public class Ex_Animal {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		// ������ �� ������ �迭�� �����, Moveable [] Ÿ������ refer.
		Moveable[] animals = (Moveable[]) new ����[10];

		// N������ ȣ���̿� M������ �䳢�� �̸��� �Է¹޾� �����մϴ�.
		int N = input.nextInt();
		String name = null;
		int i = 0;
		for (i = 0; i < N; i++) {
			name = input.next();
			animals[i] = new ȣ����(name);
		}
		int k = i;
		int M = input.nextInt();
		for (i = k; i < k + M; i++) {
			name = input.next();
			animals[i] = new �䳢(name);
		}

		// animals[i]�� �̿��Ͽ� ȣ���̿� �䳢�� move()�� �����մϴ�.
		for (i = 0; i < N + M; i++) {
			animals[i].move();
		}
	}
}

//�Ʒ� �������̽��� Ŭ������ �ڵ带 ���а�
//�ʿ��� �κ��� �߰��Ͽ� �ϼ��մϴ�.
interface Moveable {
	public void move();
}

class ���� implements Moveable {
	private String name;

	public ����() {
	}

	public ����(String name) {
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

class ȣ���� extends ���� {
	// �����ڸ� �ϼ��ϼ���
	String name;

	public ȣ����(String name) {
		this.setName(name);
	}

	public void move() {
		System.out.println(this.getName() + " : ���ӿ��� ��� ��� �����Դϴ�");
	}

}

class �䳢 extends ���� {
	// �����ڸ� �ϼ��ϼ���

	public �䳢(String name) {
		this.setName(name);
	}

	public void move() {
		System.out.println(this.getName() + " : ���� �������⸦ ��¦��¦ �پ�ٴϸ� ��ϴ�~");
	}

}
