package kr.ac.kopo.day0308HW;

import java.util.Scanner;

public class HWMain06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("20 ~ 120 사이의 숫자를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= a; i++) {

			int t = i / 10;

			if (i % 10 == 0) {
				if (i % 30 == 0 && i != 120) { 		// 30의 배수 '짝'출력, 120은 아님
					System.out.print('짝');
				}
				for (int j = 1; j <= i; j += 10) { 		// 10의 배수 "뾰숑" 출력
					System.out.print('뽀');
				}
				System.out.println("숑");

			} else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) { 		// 3,6,9 '짝' 출력
				if (t == 3 || t == 6 || t == 9) {
					System.out.print('짝');
				}
				System.out.println('짝');

			} else if (t == 3 || t == 6 || t == 9) { 		// 10의자리 3,6,9 일때 '짝' 출력
				System.out.println('짝');

			} else 			// 그 외 나머지 숫자 출력
				System.out.println(i);

		}
		sc.close();
	}
}
