package kr.ac.kopo.day0306;

public class OperationMain01 {

	public static void main(String[] args) {

		int a=0, b=1, c=-1; //������ ������ ������ ',' �� ����
							// ',' = ���� ������
		//boolean result = ++ a> 0 && ++b >= 1 && ++c > 0;
		boolean result = ++ a> 0 || ++b >= 1 || ++c > 0; // && �� || �߿��� && �� �켱������ ����
														// ������ �������� �켱���� ����
														// �켱������ ���� ���� �� ū ����� ���� (A||B)&&C
		System.out.println(result);
		System.out.println("a: "+a+", b: "+b+", c: " + c);
	}
}
