package com.kh.day08.oop.homwork.q6;

public class Card {
	//소유자 이름
	//카드번호
	//유효기간
	//cvc
	//비밀번호
	
	int cardNumber;
	//static을 사용하여 모든 클래스의 전역변수로 설정하여 값이 누적되게 만듬
	//static을 사용하지 않으면 매 클래스에 값이 초기화됨
	static int serialNum = 10000;
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
		//증가된 값을 저장 하지 못함
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber + "입니다."); 
	}
}
