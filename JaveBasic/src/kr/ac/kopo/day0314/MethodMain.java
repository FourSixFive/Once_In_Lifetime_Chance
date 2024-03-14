package kr.ac.kopo.day0314;

public class MethodMain {

/*	
	반환형 메소드명(매개변수) {				//반환형 = 피호출자>호출자 변수 전달통로 , 매개변수 = 호출자>피호출자 변수 전달통로
		실행문장
	}
*/	
	static void printStar(char ch, int a) {			//static main 일때는 메소드선언시에도 static을 붙여줘야함
		
		for(int i = 0; i<a; i++) {
		System.out.print(ch);
		}System.out.println();
	}
	public static void main(String[] args) {
		
		printStar('*',10);					//정의한 메소드를 사용할때 메소드 호출이라고 함
		System.out.println("Hello");
		printStar('@',20);
		System.out.println("Hi");
		printStar('!',5);
		System.out.println("Good-bye");
		printStar('^',16);
		
		
/*
		System.out.println("**********");
		System.out.println("Hello");
		System.out.println("**********");
		System.out.println("Hi");
		System.out.println("**********");
		System.out.println("Good-bye");
		System.out.println("**********");
*/
	}
}
