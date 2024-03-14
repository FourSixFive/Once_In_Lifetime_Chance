package kr.ac.kopo.solo;

import java.util.Scanner;

public class ExMain14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			if(j!=0||k!=0) {
				System.out.println(j+k);
				
			}else if(j==0&&k==0) {
				break;
			}
			
		}
	}
}
