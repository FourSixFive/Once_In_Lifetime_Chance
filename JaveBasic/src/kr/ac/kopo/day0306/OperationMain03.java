package kr.ac.kopo.day0306;

import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ���� : ");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		//������� �Ǵ��ڵ�
		boolean result = secondNum!=0 && firstNum % secondNum == 0;
		
		System.out.printf("%d(��)�� %d�� ������� �Ǵ� : %b",firstNum,secondNum,result);
	}
}
