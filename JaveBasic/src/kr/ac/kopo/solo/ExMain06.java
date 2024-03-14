package kr.ac.kopo.solo;

import java.util.Scanner;

public class ExMain06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		
		if(max<=b) {
			if(b<=c) {
				max=c;
			}else if(b>=c) {
				max=b;
			}
		}else if(max<=c) {
			if(b>=c) {
				max=b;
			}else if(b<=c) {
				max=c;
			}
		}
		
		if(a==b&&b==c) {
			System.out.println(10000+(a*1000));
		}else if(a==b) {
			System.out.println(1000+(a*100));
		}else if(b==c) {
			System.out.println(1000+(b*100));
		}else if(a==c) {
			System.out.println(1000+(c*100));
		}else
			System.out.println(max*100);
	}
}
