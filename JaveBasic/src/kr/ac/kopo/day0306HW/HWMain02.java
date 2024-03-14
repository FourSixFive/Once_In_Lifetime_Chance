package kr.ac.kopo.day0306HW;

import java.util.Scanner;    //import 명령어 Ctrl+Shift+O
							//import java.util.*; == util.안에 있는 모든 클래스 업로드

public class HWMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		int Num1 = a/3600;
		int Num2 = (a%3600)/60;
		int Num3 = (a%3600%60); // a % 3600(나머지시간) % 60(나머지분);

		if(Num2==0 && Num3==0){
			System.out.printf("%d시간",Num1);
		}else {
			System.out.printf("%d시간 %d분 %d초",Num1,Num2,Num3);
		
		}
		sc.close();
	}
}
