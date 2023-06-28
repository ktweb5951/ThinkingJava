package com.kh.day02.operator.exercise;

import java.util.*;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word 에 초기화
		// 영어 대문자 확인 : true
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자를 입력하세요 : ");
//		String word = sc.next();
//		
//		
//		if(word == word.toUpperCase()) {
//			System.out.println("대문자");
//		} else if(word == word.toLowerCase()){
//			System.out.println("소문자");
//		} else {
//			System.out.println("둘다 포함");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String word = sc.next();
		boolean result;
		
		result = (word == word.toUpperCase());
		System.out.println("영어 대문자 확인: "+ result);
	
		//문자열에서 첫번째 인덱스값을 자르니깐 문자가 됨
//		char word = sc.next().charAt(0); 
//		System.out.println("문자 줄력 : " + word);
//		boolean result = (word >= 'A') && (word <= 'Z');
//		System.out.println("영어 대문자 확인 : " + result);

		
		
		// 연습문제1번-2
		int aNum = 70;
		int bNum = 55;
		boolean result1, result2, result3, result4;
		result1 = (aNum == bNum) || (aNum++ < 100);
		result2 = (aNum < bNum) && (--bNum < 55);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		
		System.out.println("a 값 : " + aNum);
		System.out.println("b 값 : " + bNum);
		
	}
}



	

