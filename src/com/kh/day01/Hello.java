package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		return num1+num2;
//		 This method must return a result of type int
//		 리턴을 쓰지 않았을 경우 생기는 오류(int 사용시 값을 리턴해야 함)
	}
	
	public static void main(String [] args) {
		int i = 20;
		int s;
		char a;

		a= '?';
		s = sum(i, 10);
//		메소드 호출
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}
