package day2.exam;

import java.util.Scanner;

public class Ex_Sum {

	static Scanner input = new Scanner(System.in);

	// ___�� �ش��ϴ� �ùٸ� �������� ����Ÿ�԰� �Ű������� �ְ�
	// �ڵ带 �ϼ��ϼ���

	// �� �� ������ ��ä�� �о�� �����մϴ�.
	public static String �Ѻ�() {
		return input.nextLine();
	}

	// ������ ��������� �и��� �� String [] Ÿ������ �����մϴ�.
	public static String[] ����(String line) {
		return line.split(" ");

	}

	// String [] �� ��� ������ ���ڷ� �ٲ� �� �������� ���Ͽ� �����մϴ�.
	public static int ��(String[] strs) {
		int sum = 0;
		for (String v : strs) {
			sum += Integer.parseInt(v);
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		int num = input.nextInt();
		input.nextLine();
		for (int i = 0; i < num; i++) {
			String line = �Ѻ�();
			String[] values = ����(line);
			int result = ��(values);
			System.out.printf("[%3d] : %d \n", i + 1, result);
		}
	}
}
