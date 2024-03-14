package kr.ac.kopo.day0312;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
		
		String[] strArr = {"봄", "여름"};
		String[] strArr2 = {"가을", "겨울"};
		String[] strArr3 = new String[strArr.length+strArr2.length];
		System.out.println(Arrays.toString(strArr3));
		
		
		int location = 0;
		for(int i = 0 ; i<strArr.length;i++) {
			strArr3[location++] = strArr[i];
		}
		System.out.println(Arrays.toString(strArr3));

		
		System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
		System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
		
		System.out.println(Arrays.toString(strArr3));
	}
}