package com.kh.day07.oop.ploymorphism.exercise;

class SuperClass {
	//3
	void paint() {
		//4
		draw();
	}
	//7
	void draw() {
		//8
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass{
	void paint() {
		//2
		super.paint();
		//6
		super.draw();
	}
	void draw() {
		//5
		System.out.println("Sub Object");
	}
}


public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
		//1. paint를 호출, 업캐스팅되어 서브클래스 참조
		

		
	}
}
