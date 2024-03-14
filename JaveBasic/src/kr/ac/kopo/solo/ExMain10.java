package kr.ac.kopo.solo;

import java.util.Scanner;

public class ExMain10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 4;i<=N;i+=4) {
			System.out.print("long ");
		}System.out.println("int");
	}
}
