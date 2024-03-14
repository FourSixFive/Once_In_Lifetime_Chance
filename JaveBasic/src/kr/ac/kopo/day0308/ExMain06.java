package kr.ac.kopo.day0308;

public class ExMain06 {

	public static void main(String[] args) {

		int j = 1;

		for (int i = 4; i >= 0; --i) {

			for (j = 1; j <= 5; ++j) {
				System.out.print(i + j);
			}
			System.out.print('\n');
		}
	}

}
