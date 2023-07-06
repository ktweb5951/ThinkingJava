package com.kh.day09.exercise;

public class Exercise_Wraper {
	
	// "230515"와 "231026인 문자열을 계산해서 출려하시오;
	public static void main(String[] args) {
		String openDate = "230515";
		String closeDate = "231026";
		int result = Integer.parseInt(openDate) + Integer.parseInt(closeDate);
		
		System.out.println("결과 : " + result);
	}
	
}
