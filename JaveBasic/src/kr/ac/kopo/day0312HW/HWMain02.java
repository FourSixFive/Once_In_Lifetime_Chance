package kr.ac.kopo.day0312HW;

import java.util.Random;

public class HWMain02 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10]; 					// 00~99중 5개 랜덤이므로 배열크기는 10칸

		System.out.println("< PRINT >");
		for (int i = 0; i < 5; i++) {
			int num = r.nextInt(100);

			arr[2 * i] = (int) num / 10;			//십의자리 0부터 짝수칸 보관
			arr[2 * i + 1] = (int) num % 10;		//일의자리 1부터 홀수칸 보관

			System.out.printf("%d%d ", (int) num / 10, (int) num % 10);
		}
		System.out.println('\n');

		System.out.println("< REVERSE >");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d%d ", arr[9 - (2 * i)], arr[8 - (2 * i)]);		//역순은 arr[9], arr[8] 순으로 출력되어야함
		}

	}
}
