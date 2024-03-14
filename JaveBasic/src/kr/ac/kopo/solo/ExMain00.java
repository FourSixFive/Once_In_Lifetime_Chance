package kr.ac.kopo.solo;
import java.util.Scanner;
public class ExMain00 {
	public static void main(String[] args) {
		
//		System.out.println('1'+2);//'1' ascii 10진법으로 표기 > 49 + 2 = 51
//		System.out.println(true + "null");
		
//		int new = 1;
//		int fah = 100;
//		double cel = ((double)5 / (double)9) * (fah - 32);
//		
//		System.out.printf("화씨 %d도는 섭씨 %.02f도입니다.\n",fah,cel);

		
/*		int score = 80;
		char grade = ' ';
		grade = (score >=90) ? 'A' : ((score >=80) ? 'B' : 'C');
		//(score >=80)~~'C'); 까지 삼항연산 한묶음 = pack, (score >=90)~~pack 까지 삼항연산 한묶음
		System.out.println("당신의 학점은 "+grade+"입니다."); */
	


        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int z = sc.nextInt();
        
        System.out.print(y+x+z);
	}
}
