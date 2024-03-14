package kr.ac.kopo.day0307;

import java.util.Random;

/*
 * 1 입력 시 > "ONE"
 * 2 입력 시 > "TWO"
 * 3 입력 시 > "THREE"
 * 그외		> "ERROR"
 */




public class SwitchMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(5)+1; // 0+1 ~ 4+1 >> 1~5

	switch(num) {
	case 1 :
		System.out.println("ONE");
		break;
	case 2 :
		System.out.println("TWO");
		break;	
	case 3 :
		System.out.println("THREE");
		break;
	default :						 //switch문의 default는 내부 모든 케이스 실행 후 실행
		System.out.println("ERROR"); //즉, default의 문단은 위치가 바뀌어도 상관없음
		break;	
	}
	
	
	
	
	}
}
