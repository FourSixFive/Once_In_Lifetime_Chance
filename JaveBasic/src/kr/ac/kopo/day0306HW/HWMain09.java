package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책 권수 : ");
		int a = sc.nextInt();
		
		if (a<0) {
			System.out.println("잘못 입력했습니다.");
		}else if (a==0) {
			System.out.println("보유하고 있는 책 없음.");
		}else if (a==1) {
			System.out.println(a+" book");
		}else {
			System.out.println(a+" books");
		}

	sc.close();
		
	}

}
