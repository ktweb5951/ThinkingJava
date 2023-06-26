package com.kh.day01.typetrans;

public class Exam_TypeTrans2 {
	public static void main(String [] args) {
		byte bNum = 127;
		int iNum = 100;
		int iNum2 = 10;
		double dNum = 4.0;
		
//		자동 형 변환
//		byte->int 작은거에서 큰타입으로 자동 형 변환
		System.out.println(bNum + iNum);
		System.out.println(iNum2 / dNum);
//		강제 형 변환 (데이터 손실이 발생)
		System.out.println((byte)(bNum + iNum));
		System.out.println((int)2.9 + 1.8);
//		자동 형 변환 : int->double , 강제 형 변환 : double -> int
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
