package kr.ac.kopo.day0314HW;

import java.util.Scanner;

public class HWMain01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Icecream ice = new Icecream();

		
		int num = ice.inputnumber();

		
		for(int i = 1; i <= num;i++) {
			System.out.println("** "+i+"\'s 아이스크림 구매정보 입력 **");
			ice.buyinfo();
			ice.buyprice();
			System.out.println();
		}
		
	}
}
