package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String [] args)
	{
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		
		Circle [] cArray;
		cArray = new Circle[5];
		//Circle c = cArray[0];
		//비어있는 공간
		System.out.println(cArray[0]);
		
		// 공간안에 객체
		cArray[0] = new Circle();
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		
		
//		for(int i = 0; i < cArray.length; i++){
//			cArray[i] = new Circle(); //이때 화살표가 생기는 것
//		}
//		NullPointerException 오류 발생시 . 앞에 값이 잘못 된 것 // 객체 할당이 안되어있음
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
	}
}
