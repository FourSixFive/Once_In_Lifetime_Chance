package kr.ac.kopo.day0308HW;

import java.util.Scanner;

public class HWMain03 {
	public static void main(String[] args) {

		System.out.println("시작 단과 종료 단을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();

		if(a<=b) {								//큰수와 작은수 순서 관계없이 입력해도 작동하게끔 if문으로 구간나눔
			for (int i = a; i <= b; i++) {
				System.out.printf("\n***** %d단 *****\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}else {
			for (int i = b; i <= a; i++) {
				System.out.printf("\n***** %d단 *****\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}
		
	sc.close();
	}
}
