package kr.ac.kopo.solo;

import java.util.Scanner;

public class ExMain02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i/10) {
		case 10:
			System.out.print('A');
			break;
		case 9:
			System.out.print('A');
			break;
		case 8:
			System.out.print('B');
			break;
		case 7:
			System.out.print('C');
			break;
		case 6:
			System.out.print('D');
			break;
		default:
			System.out.print('F');
		}
	}
}
	