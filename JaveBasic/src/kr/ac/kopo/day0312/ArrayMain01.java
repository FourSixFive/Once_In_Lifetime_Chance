package kr.ac.kopo.day0312;

import java.util.Arrays;

public class ArrayMain01 {
	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr : "+arr[i]);
		}	
		
		//1.5version for문
		System.out.println();
		for(int data:arr) {
			System.out.println("arr : "+data);
		}
		
		System.out.println();
		System.out.println("arr : "+Arrays.toString(arr));
		
		String [][] ar = new String[3][2]; // 1차원 배열을 3개 만들고 각각 1차원 배열은 원소를 4개씩 보관해주는 2차원 배열 ar 선언
		
		System.out.println(ar[0]);
		
	}	
}
