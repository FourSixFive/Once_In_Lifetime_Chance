package kr.ac.kopo.day0312HW;

import java.util.Scanner;

public class HWMain03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		int sum = 0; 			// 총점
		int err = 0; 			// 에러횟수
		int time = 0;			// 학생 수

		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			time++;
			System.out.printf("%d\'s 성적 : %d\n", i + 1, a);
		}
		System.out.println("--------------------");
		System.out.println("번호   성적        학점");
		System.out.println("--------------------");

		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0 && arr[i] <= 100) {
				switch (arr[i] / 10) {
				case 10: {
					System.out.println((i + 1) + "   " + arr[i] + "     A");
					break;
				}
				case 9: {
					System.out.println((i + 1) + "   " + arr[i] + "     A");
					break;
				}
				case 8: {
					System.out.println((i + 1) + "   " + arr[i] + "     B");
					break;
				}
				case 7: {
					System.out.println((i + 1) + "   " + arr[i] + "     C");
					break;
				}
				case 6: {
					System.out.println((i + 1) + "   " + arr[i] + "     D");
					break;
				}
				default: {
					System.out.println((i + 1) + "   " + arr[i] + "     F");
				}
				}
				sum += arr[i];
			} else {
				System.out.println((i + 1) + "   ERROR");
				err++;
			}
		}
		System.out.printf("%d회 입력 중 [%d]회 에러발생\n", time, err);
		System.out.println("총점 : " + sum + "점");
		System.out.printf("평균 : %.2f점", (double) sum / (double) time);		//실수표현은 정수뒤에 '.' 을 붙여도 가능
																			//둘중 하나만 해도 가능

		sc.close();
	}
}
