package kr.ac.kopo.solo;

import java.util.Scanner;

public class ExMain12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; ++i) {

			for (int j = 1; j <= i; ++j) {

				System.out.print('*');

			}
			System.out.println();
		}

	}

}

