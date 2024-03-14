package kr.ac.kopo.day0308;

public class ExMain19 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}
				for (int j = 1; j <= 9 - (2 * i); j++) {
					System.out.print(' ');
				}
				if (i <= 4) { 				// 5번째 줄은 5+4 이므로 마지막 줄은 추가제어
					for (int j = 1; j <= i; j++) {
						System.out.print('*');
					}
				} else if (i == 5) {
					System.out.print("****");
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print('*');
				}
				for (int j = 1; j <= (2 * i) - 11; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print('*');
				}
			}

			System.out.println();
		}
	}
}
