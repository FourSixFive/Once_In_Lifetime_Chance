package kr.ac.kopo.day0307;

public class ForMain {
		//for문은 for( ; ; ){} == 각 조건이 공백일 시 무한루프
	public static void main(String[] args) {

		System.out.println("==== START ====");
		
		for ( int cnt = 1; cnt <= 5; cnt+=1) {
			System.out.println("Hello");
		}
		
		System.out.println("===== END =====");
	}

}
