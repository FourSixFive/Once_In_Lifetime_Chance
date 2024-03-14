package kr.ac.kopo.day0314;

class Cellphone{								// CellphoneMain 선언 후에 Cellphone 클래스를 선언할 수 있음
	String name;								// 클래스안에 다른 클래스 선언을 했을때는 앞에 public을 붙이면 에러가 남(이유모름)
	String number;
	String company;
//	String [];
}

public class CellphoneMain {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
		
		cp.name = "홍길동";
		cp.number = "010-1111-2222";
		cp.company = "삼성";

		Cellphone cp2 = new Cellphone();
		
		cp2.name = "길동";
		cp2.number = "010-3333-4444";
		cp2.company = "애플";
		
		Cellphone [] cpArr = {cp, cp2};
	
	
	}
}
