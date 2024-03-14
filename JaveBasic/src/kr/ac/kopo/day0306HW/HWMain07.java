package kr.ac.kopo.day0306HW;

import java.util.Scanner;

public class HWMain07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력(알파벳) : ");
		String inputStr = sc.nextLine();
		char c = inputStr.charAt(0);
				
		if(c >= 65 && c <=90) {					// if(c>='A' && c<='Z'){}
			System.out.printf("%c",c+32);
			
		}else if(c >= 97 && c <122){			// else if(c>='a' && c<='z'){}
			System.out.printf("%c",c-32);
			
		
		}
		
		sc.close();
		//문자는 기본적으로 유니코드로 인식, 굳이 형변환 탭이 필요 없음
		//a=97 z=122   A=65 Z=90
		

	}

}
