package kr.ac.kopo.day0311;

import java.util.Scanner;

public class ArrayMain01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(i+1 + "\'s num : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
//		int[] ptr = new int [4];		//int형 자료를 4개 만들고 new를 사용해 heap메모리에 저장(변수저장)
										//heap메모리 주소는 int[] ptr에 넣어 stack메모리에 저장(배열의 주소를 위한 참조변수 저장)
		
		// ptr[0], ptr[1], ptr[2], ptr[3] int형 변수 4개의 집합에 각각 1,2,3,4번째 int형 자료들
		// int 타입의 배열이름 = iArr >> int[] iArr; 이고 해당 공간에는 int형 변수 자체는 저장할 수 없음
	
	
		//int[]prime={1,2,3};
		//int[]print=new int[]{1,2,3};
	
	
	}
}