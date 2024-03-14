package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("달러를 입력하세요 ? ");
		int a = sc.nextInt();
		
		System.out.printf("원화 : %.2f원",a*1092.50);

		sc.close();
	}

}
