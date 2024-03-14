package kr.ac.kopo.day0312HW;

import java.util.Scanner;

public class HWMain05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 100 사이의 정수 입력 : ");
		int a = sc.nextInt();
		int time = 0;		//약수의 개수
		int count = 0;		//인덱스 번호 0~n 호출을 위한 변수
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				time++;
			}
		}

		int[] arr = new int[time];
		for (int i = a; i >= 1; i--) {
			if (a % i == 0) {
				arr[count] = a / i;
				count++;
			}
		}
//		System.out.println(Arrays.toString(arr));

		System.out.println(a + " 약수의 개수 : " + time + "개");

		for (int i = 0; i < time; i++) {
			System.out.print(arr[i] + " ");
		}
	sc.close();
	}
}
