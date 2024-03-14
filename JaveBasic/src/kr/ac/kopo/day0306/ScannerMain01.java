package kr.ac.kopo.day0306;

import java.util.Scanner; //import�� �ٸ� ��Ű���� �ִ� Ŭ������ �ҷ����� ���� ��ɾ�

public class ScannerMain01 {
	
	public static void main(String[] args) {
		
		new java.util.Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);//��¥�� �ܿ��
		
		System.out.print("���ڸ� �Է� : ");
		char d = sc.nextLine().charAt(0); //charAt()=�Է¹��� ���� �� ù ���ڸ� �Է¹ޱ�
		System.out.println("d : " + d);
		
		
		System.out.println(" ���� �Է� : ");
//		int a = 10;
		int a = sc.nextInt();
		sc.nextLine(); // Ű���� �Է� ������ ������ ����ֱ����� ���� / ����or�Ǽ��� ���ڰ� ȥ��ɶ���
		System.out.println("a : " + a);
		
		System.out.println(" �Ǽ� �Է� : ");
		double b = sc.nextDouble();
		sc.nextLine(); // Ű���� �Է� ������ ������ ����ֱ����� ����
		System.out.println("b : " + b);

		System.out.println("���ڿ��� �Է� : ");
//		String c = sc.next(); //�ܾ���� �Է�
		String c = sc.nextLine(); //������� �Է�
		System.out.println("c : " + c);
	}
}
