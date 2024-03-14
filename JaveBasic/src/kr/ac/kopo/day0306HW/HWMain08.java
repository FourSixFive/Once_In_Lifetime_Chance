package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("물건값을 입력 : ");
		int a = sc.nextInt();
		System.out.println("지불한 돈의 액수 : ");
		int b = sc.nextInt();
		
		int change = b-a;
		
	System.out.printf("거스름돈 : %d 원\n",change);
		
	
	int Num1 = change/1000;
	int Num2 = (change%1000)/500;
	int Num3 = (change%1000%500)/100;
	int Num4 = (change%1000%500%100)/50;
	int Num5 = (change%1000%500%100%50)/10;
	
	System.out.printf("1000원 : %d 개\n500원 : %d 개\n100원 : %d 개\n50원 : %d 개\n10원 : %d 개",Num1,Num2,Num3,Num4,Num5);
	
	
	sc.close();
	
	}
	
	

}
