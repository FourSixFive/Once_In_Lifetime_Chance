package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("세번째 정수 : ");
		int c = sc.nextInt();
		sc.nextLine();

		int max = a;
		int min = b;
		if(b>a) {
			max=b;
			min=a;
		}
		if (c>max) {
			System.out.printf("%d > %d > %d",c,max,min);	
		}else if(c>min) {
			System.out.printf("%d > %d > %d",max,c,min);
		}else {
			System.out.printf("%d > %d > %d",max,min,c);
		}
		
		
		
		
		
		
/*		if(b>=a&&b<=c) {
			System.out.printf("%d %d %d",c,b,a);
		}else if(c>=a&&b>=c) {
			System.out.printf("%d %d %d",b,c,a);
		}else if(b<=a&&a<=c) {
			System.out.printf("%d %d %d",c,a,b);
		}else if(b<=c&&a>=c) {
			System.out.printf("%d %d %d",a,c,b);
		}else if(c<=a&&b>=a) {
			System.out.printf("%d %d %d",b,a,c);
		}else
			System.out.printf("%d %d %d",a,b,c);
*/
	sc.close();
	}

}
