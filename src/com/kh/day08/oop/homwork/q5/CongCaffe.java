package com.kh.day08.oop.homwork.q5;

public class CongCaffe extends Caffe{
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.CONG_AMERICANO) {			
			System.out.println("아메리카노 준비해 드리겠습니다.");
		}else if(money == Menu.CONG_LATTE) {
			System.out.println("라떼 준비해 드리겠습니다.");
		}else {
			System.out.println("금액이 더 필요합니다.");
		}
	}
}
