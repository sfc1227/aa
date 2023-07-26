package day2.exam;

import java.util.Scanner;

public class Ex_Sum {

	static Scanner input = new Scanner(System.in);

	// ___에 해당하는 올바른 리턴형과 인자타입과 매개변수를 넣고
	// 코드를 완성하세요

	// 한 줄 문장을 통채로 읽어와 리턴합니다.
	public static String 뚜비() {
		return input.nextLine();
	}

	// 문장을 빈공간으로 분리한 후 String [] 타입으로 리턴합니다.
	public static String[] 나나(String line) {
		return line.split(" ");

	}

	// String [] 의 모든 내용을 숫자로 바꾼 후 누적값을 구하여 리턴합니다.
	public static int 뽀(String[] strs) {
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
			String line = 뚜비();
			String[] values = 나나(line);
			int result = 뽀(values);
			System.out.printf("[%3d] : %d \n", i + 1, result);
		}
	}
}
