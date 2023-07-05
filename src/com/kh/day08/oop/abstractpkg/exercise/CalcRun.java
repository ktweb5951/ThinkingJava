package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new GoodCalc(); //업캐스팅
		//추상클래스는 객체 생성이 안된다..
		//Cannot instantiate the type Calculator 
		//객체생성 안됨 , 상속 받은 다른 클래스를 적어줘야함
		int [] a = {1,2,3,4,5};
		System.out.printf("합 : %d\n", calc.add(1,2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
		System.out.printf("평균 : %.2f", calc.average(a));
	}

}
