package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;

	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	//void가 아닌 다른 자료형을 쓰면 리턴값이 있어야함
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
