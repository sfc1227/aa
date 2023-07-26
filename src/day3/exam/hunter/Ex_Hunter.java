package day3.exam.hunter;

import java.util.Scanner;

public class Ex_Hunter {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		���� forest = ����.getInstance();
		forest.animals = new ����[10]; // �⺻ 10���� ���� ����.

		String name = null;
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			name = input.next();
			if (name.equals("�䳢"))
				forest.animals[i] = new �䳢(name);
			if (name.equals("��"))
				forest.animals[i] = new ��(name);
			if (name.equals("������"))
				forest.animals[i] = new ������(name);
		}

		// ���ӿ� �ִ� ������ ���̱�
		forest.show();

		// ��ɲ۰� ��ɰ� ����.
		Huntable h1 = new ��ɲ�();
		Huntable h2 = new ��ɰ�();
		System.out.println(">>��ɲ۰� ��ɰ��� ����� �����մϴ�.");
		while (true) {
			if (����.numOfanimals == 1) {
				System.out.println("��ɺҰ�");
				break;
			}
			h1.hunt(forest.animals);
			h2.hunt(forest.animals);
		}
		forest.show();

	}

}

//Huntable �������̽� : �Ʒ� �κ��ڵ带 �̿��Ͽ� ����ϱ� �޼ҵ� ������ �ϼ��ϼ���.
interface Huntable {
	public default void hunt(����[] animals) {
		if (����.numOfanimals == 1) {
			System.out.printf("���ӿ� %s�� ���ҽ��ϴ�. ����� �ߴ��մϴ�.\n", animals[0].getName());
			return;
		}

		// ��ɵ����� �����մϴ�. �迭�� ù��° ������ ��ɰ��� �ǰ�
		// ù��° ������� �� ���� ������ ��ü�մϴ�.
		���� ��ɰ� = animals[0];
		animals[0] = animals[����.numOfanimals - 1];
		����.numOfanimals--;
		System.out.printf("%s ��ɼ���! \n", ��ɰ�.getName()); // ��ɼ��� �޽���

	}
}

//���� Ŭ���� : ������ �� ���� instance�� ���� �� ������ �����迭����, numOfnaimals�� ������ �ֽ��ϴ�.
//static , non-static����� �̿��Ͽ� ���� Ŭ������ �ϼ��ϼ���

class ���� {

	static int numOfanimals = 0;
	static ���� instance = null;
	����[] animals;

	private ����() {

	}

	public static ���� getInstance() {
		if (instance == null) {
			instance = new ����();
		}
		return instance;
	}

	// ���ӿ� �ִ� ������ ����մϴ�.
	public void show() {
		System.out.printf("==���ӿ� ��� �ִ� ���� : �� %d ����==\n", ����.numOfanimals);
		for (int i = 0; i < ����.numOfanimals; i++) {
			System.out.print(animals[i].getName() + " ");
		}
		System.out.println();
	}
}

///////////////////////////////////////////////
//�׽�Ʈ �ڵ带 �� �а� ����Ŭ������ �䳢, ��, ������ Ŭ������ �ϼ��ϼ���
class ���� {
	private String name;

	public ����() {
		����.numOfanimals++;
	}

	public ����(String name) {
		this();
		this.name = name + ����.numOfanimals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class �䳢 extends ���� {

	public �䳢(String name) {
		super(name);
	}

	public void �ٱ�() {
	}
}

class �� extends ���� {

	public ��(String name) {
		super(name);
	}

	public void ��������() {
	}
}

class ������ extends ���� {

	public ������(String name) {
		super(name);
	}

	public void ����Ÿ��() {
	}
}

//�׽�Ʈ �ڵ带 �� �а� ��ɲ۰� ��ɰ� Ŭ������ �ϼ��ϼ���
class ��ɲ� implements Huntable {

}

class ��ɰ� extends ���� implements Huntable {

}
