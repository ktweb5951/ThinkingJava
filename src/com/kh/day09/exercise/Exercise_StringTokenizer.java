package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오.
		
		String std = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(std, "/");
		//String data = st.nextToken();
	
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			if( token.equals("홍련")) {
				System.out.print(token);				
			}		
		}
		
		
	}

}
