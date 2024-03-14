package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("나눌 수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();
		
	}

}
