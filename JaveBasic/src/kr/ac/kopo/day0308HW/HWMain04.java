package kr.ac.kopo.day0308HW;

public class HWMain04 {
	public static void main(String[] args) {

		int hour=1;
		int up=5;
		int snail=0;		//달팽이 초기위치
		
		
		for(snail=4;snail<=50;hour++) {

			System.out.printf("[%02d 시간후] 달팽이가 올라간 총 높이 : %dM\n", hour, snail);
			snail=snail+up-1;		//50M 아래, 한시간에 5(-1)M씩 상승
		}
		
		for(snail=51;snail<=102;hour++) {
			
			System.out.printf("[%02d 시간후] 달팽이가 올라간 총 높이 : %dM\n", hour, snail);
			snail=snail+up-2;		//50M 위, 한시간에 5(-2)M씩 상승
		}
		
	}
}

