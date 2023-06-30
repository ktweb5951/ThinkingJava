package com.kh.day05.oop.exercise;

public class Rectangle {
//	너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	
	// =================================> 필드
	//필드에서 바로 값을 초기화 해도 되지만 생성자에서 초기화하는게  원칙
	public int width;
	public int height;
	
	// =================================> 생성자
	public Rectangle() {
		//초기화
		width = 0;
		height = 0;
	}
	
	// =================================> 메소드
	public int getArea(){
		return width * height;
	}
}
