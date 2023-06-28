package com.kh.day02.operator.exercise;
import java.util.*;

public class Exercise_Logical1 {
	public static void main(String [] args)
	{
		//입력한 정수가 1~100사이의 숫자인지 확인하세요.
		//변수 num에 초기화
		//1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean result;
		
		result = (num>=1) && (num<=100);
		System.out.println("1부터 100사이의 숫자인가? : " + result);

		
		
		
		//입력 받은 num이 1부터 100사이의 숫자인지 확인
//		if(num>=1 && num<=100) {	
//			System.out.println("1부터 100사이의 숫자인가? : true");
//		} else {
//			System.out.println("1부터 100사이의 숫자인가? : false");
//		}
			
	}
}
