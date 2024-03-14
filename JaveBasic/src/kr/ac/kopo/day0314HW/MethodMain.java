package kr.ac.kopo.day0314HW;

import java.util.Scanner;

public class MethodMain {
	
	static void printresult(int a) {				//총합을 입력받아 출력하는 메소드
		System.out.println(a);
	}
		
	static int[] inputnumber() {					//a,b 를 키보드에서 입력받아 배열로 넘기는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int [] arr = {a,b};
		sc.close();
		return arr;
		
	}
		
	static int getSum(int a, int b) {				//a,b 의 값을 입력받아 a~b까지의 총합을 구해 정수로 넘기는 메소드
		int sum = 0;
		while(a <= b) {
			sum = sum + a++;
		}
		return sum;
	}	
	
	public static void main(String[] args) {
		
		int [] arr = inputnumber();
		int sum = getSum(arr[0],arr[1]);
		printresult(sum);
	
	}
}
