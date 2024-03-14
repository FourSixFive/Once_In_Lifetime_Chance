package kr.ac.kopo.day0314HW;

import java.util.Scanner;

public class Icecream {
	
	int inputnumber() {		//아이스크림 구매 개수를 키보드로 입력받아 개수를 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림 몇 개 구입할래? : ");
		int num = sc.nextInt();
//		sc.close();
		return num;
	}
	
	String buyinfo() {		//아이스크림 이름을 키보드로 입력받아 이름을 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림명 : ");
		String info = sc.nextLine();
//		sc.close();
		return info;
	}

	int buyprice() {			//아이스크림 가격을 키보드로 입력받아 가격을 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림가격 : ");
		int price = sc.nextInt();
//		sc.close();
		return price;
	}

	void getsum(int cnt, int price) {	//아이스크림 개수와 가격을 입력받아 총합을 리턴
		int sum = 0;
		for(int i = 1;i<=cnt;i++) {
			sum += price;
		}System.out.println("총계 : "+sum);
	}

}