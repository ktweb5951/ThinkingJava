package com.kh.day08.oop.homwork.q5;

public abstract class Caffe {
	String name;
	
	public Caffe() {}
	public Caffe(String name) {
		this.name = name;
	}
	
	
	//커피를 만들어 준다.
	abstract public void  makeCoffee(int money);
//	public void makeCoffee(int money) {
//		if(money == 4000) {
//			System.out.println("주문하신 아이스아 메리카노가 한잔 나왔습니다.");
//		}else if(money == 4500) {
//			System.out.println("주문하신 아이스 라떼 한잔 나왔습니다.");
//		}
//	}
}
