package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.printf("반지름이 %d일때 원의 면적은 %f 입니다.",a,a*a*3.141592);
	
		sc.close();
	}
	
}
