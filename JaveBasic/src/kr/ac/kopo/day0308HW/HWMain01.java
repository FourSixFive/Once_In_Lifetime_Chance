package kr.ac.kopo.day0308HW;

import java.util.Scanner;

public class HWMain01 {
	public static void main(String[] args) {

		System.out.println("2 ~ 9 단 중에서 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("*** " + a + "단" + " ***");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}
		sc.close();
	}
}
