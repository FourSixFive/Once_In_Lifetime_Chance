package kr.ac.kopo.day0312HW;

import java.util.Scanner;

public class HWMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arrodd = new int[10]; 		// 짝수들 모음 배열
		int[] arreven = new int[10]; 		// 홀수들 모음 배열
		int sumodd = 0; 					// 짝수들 총합
		int sumeven = 0;			 		// 홀수들 총합

		for (int i = 0; i < 10; i++) { 			// 짝수만 10번, 홀수만 10번 나올수도 있으므로 배열크기는 10, 10회반복
			int num = sc.nextInt();
			System.out.printf("num%d : %d\n", i + 1, num);
			if (num % 2 == 0) {
				arrodd[i] = num;
			} else {
				arreven[i] = num;
			}
		}
		System.out.println("< 짝수 >");
		for (int i = 0; i < 10; i++) {
			if (arrodd[i] != 0) {
				System.out.print(arrodd[i] + " ");
				sumodd += arrodd[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + sumodd);

		System.out.println("< 홀수 >");
		for (int i = 0; i < 10; i++) {
			if (arreven[i] != 0) {
				System.out.print(arreven[i] + " ");
				sumeven += arreven[i];
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + sumeven);
		sc.close();
	}
}
