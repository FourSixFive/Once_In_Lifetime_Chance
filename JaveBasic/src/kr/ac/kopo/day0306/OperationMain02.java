package kr.ac.kopo.day0306;

public class OperationMain02 {

	public static void main(String[] args) {

		int firstNum = 12;
		int secondNum = 2;
		
		boolean result = firstNum != 0 && secondNum != 0 && firstNum % secondNum == 0;
		
		//error : �ý���������, Exception : �ڵ����
		System.out.println("�� : " + (result ? "���":"����ƴ�"));
	}

}
