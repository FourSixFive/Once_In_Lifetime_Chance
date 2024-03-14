package kr.ac.kopo.day0306HW;

import java.util.Random;

public class HWmain11 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int a = r.nextInt(100);
		int b = r.nextInt(100);
		int c = r.nextInt(100);
		int d = r.nextInt(100);
		
		
		System.out.printf("%d %d %d %d\n",a,b,c,d);
		
		int max = a>b ? a : b; // a,b 둘을 비교해서 큰수를 int max에 저장
		if (c>max) {
			max=c;
		}
		if (d>max) {
			max=d;
		}
		
		System.out.println("가장 큰 수 : "+max);
		
//		System.out.println("가장 큰 수 : "+(max01>max02 ? max01 : max02));
//		max01, max02 를 비교해서 큰 수를 출력
		
		/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 4개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a>=b && a>=c && a>=d) {
			System.out.println(a);
		}else if(b>=a && b>=c && b>=d) {
			System.out.println(b);
		}else if(c>=b && c>=a && c>=d) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
	*/
}
}