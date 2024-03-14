package kr.ac.kopo.day0308;

public class ExMain14 {
	public static void main(String[] args) {

/*		int col =5;
		for(int i=1;i<=9;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(' ');
			if(col<5) {
				col--;
			}else
				col++;
			
			}System.out.println();
		}
		
*/	
		

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}

			} else {
				for (int j = 1; j <= i - 5; j++) {
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
