package kr.ac.kopo.day0308;

public class ExMain09 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}

			}
			System.out.println();
		}

//		for(int i = 1;i<=5;++i) {
//			
//			for(int j = 2;j<=i;++j) { //1~4 와 2~5는 같으므로 int j=1;j<=i-1 이 보기에 편함
//				
//				System.out.print(' ');
//			}
//			for(int k = 1;k<=6-i;++k) {
//				
//				System.out.print('*');
//			}
//			
//		System.out.println();
//		}

	}

}
