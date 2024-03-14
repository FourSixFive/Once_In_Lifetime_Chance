package kr.ac.kopo.day0307HW;

import java.util.Scanner;

public class HWMain06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int j = 1;j<=5;j++) {
 
			System.out.println("\n\n성적을 입력 : ");
			int i = sc.nextInt();
			sc.nextLine();

			if(i>=101||i<0) {
				System.out.println("잘못입력하셨습니다.");
			}else {
				switch(i/10) {
				case 10:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 A입니다.",j,i,i);
					break;
				case 9:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 A입니다.",j,i,i);
					break;
				case 8:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 B입니다.",j,i,i);
					break;
				case 7:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 C입니다.",j,i,i);
					break;
				case 6:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 D입니다.",j,i,i);
					break;
				default:
					System.out.printf("%d's 성적 : %d\n%d의 학점은 F입니다.",j,i,i);
				}


			}

		}

		sc.close();

	}

}
