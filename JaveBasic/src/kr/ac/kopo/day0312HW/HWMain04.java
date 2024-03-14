package kr.ac.kopo.day0312HW;

import java.util.Scanner;

public class HWMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i= 0 ; i<arr.length;) {
			int a = sc.nextInt();
			System.out.println("num" + (i + 1) + " : " + a);
			if(arr[i]%2==0) {
				i++;
			}
		}
		
		/*
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			if (a % 2 == 1) {				//홀수일땐 입력을 무한으로 돌리므로 while(true){}, 짝수일땐 break;
				System.out.println("num" + (i + 1) + " : " + a);
				i--;
			} else {
				System.out.println("num" + (i + 1) + " : " + a);
				arr[i] = a;
			}
		}
		System.out.println("< PRINT >");
		System.out.println(Arrays.toString(arr));			//대괄호 있는 배열목록
		for (int i = 0; i < 5; i++) {						//대괄호 없는 배열목록
			System.out.print(arr[i] + " ");
		}
		*/
		sc.close();
	}
}
