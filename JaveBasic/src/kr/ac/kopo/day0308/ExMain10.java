package kr.ac.kopo.day0308;

public class ExMain10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}

			System.out.println();
		}

//		for(int i = 1;i<=5;++i) {
//			
//			for(int j = 1;j<=5-i;++j) {
//				
//				System.out.print(' ');
//			}
//			for(int k = 1;k<=i;++k) {
//				
//				System.out.print('*');
//			}
//		
//		System.out.println();
//		}
	}

}
