package kr.ac.kopo.day0307HW;

import java.util.Scanner;

public class HWMain05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("2 ~ 10 사이의 정수 입력 : ");
		
		int i = sc.nextInt();		//Integer.parseInt(sc.nextLine());
		sc.nextLine();				//입력받은 자료형을 무조건 정수값으로 변환
		
		System.out.printf("< 1 ~ 100 사이에 %d의 배수 출력>\n",i);

		int j = 1;					//for문안에 if문을 넣어 1~100에서 배수인지 아닌지 체크
									//3을 입력받으면 3의 배수인지 아닌지 1부터 100까지 질문
		for(j = 1;i*j<=100;++j) {
			System.out.println(i*j);
		
//		int j = 1;
//		
//		while(i*j<=100) {
//			System.out.println(i*j);
//
//			++j;
		}
		System.out.printf("총 %d개",j-1);
	
	sc.close();	
	
	}
	
}
