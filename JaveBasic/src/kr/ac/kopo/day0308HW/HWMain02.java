package kr.ac.kopo.day0308HW;

public class HWMain02 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {				// 2단부터 9단까지 출력
			System.out.printf("\n***** %d단 *****\n", i);
			for (int j = 1; j <= 9; j++) {			// 1~9까지 곱하기
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}
