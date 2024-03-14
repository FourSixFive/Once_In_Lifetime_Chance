package kr.ac.kopo.day0308HW;

import java.util.Random;
import java.util.Scanner;

public class HWMain05 {
	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(100) + 1; 				// 1~100까지 랜덤 숫자 뽑기

		Scanner sc = new Scanner(System.in);

		System.out.print("1~100 중 숫자 맞추기\n");

		int c = 1;
		int d = 100;

		for (int i = 6; i >= 0; i--) {				// 6회 실행, 실행횟수를 변수로 받기위해 감소식 사용

			if (i > 0) {

				System.out.println("정답 입력 : ");
				int a = sc.nextInt();
				sc.nextLine();

				if (a == num) {
					System.out.println("축하합니다 정답입니다.");
					break;
				} else if (a < num) {

					System.out.printf("%d보다 큰 수 입니다.\n기회는 총 %d번 남았습니다.\n", a, i - 1);
					c = a + 1;
				} else {

					System.out.printf("%d보다 작은 수 입니다.\n기회는 총 %d번 남았습니다.\n", a, i - 1);
					d = a - 1;
				}
				System.out.printf("\n%d ~ %d\n", c, d);		// 1~a a~100 범위 값 특정하기
			} else { 										// 마지막 6번째 반복때 else로 탈출
				System.out.printf("아쉽습니다. 기회를 다 소진하셨습니다. 정답은 [%d]입니다.", num);
			}
		}
		sc.close();
	}
}
