package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	//1. Illegal modifier for the interface field PhoneInterface.name;
	// only public, static & final are permitted
	// 퍼블릭만 허용
	//2 . The blank final field name may not have been initialized
	// 초기화를 안해서 오류가 생김, 상수에는 초기화를 꼭 해줘야함
	public String name = "";
	public static final int TIME_OUT = 10000;
	
	public abstract void receiveCall();
	// 3. Abstract methods do not specify a body //중괄호 삭제
	void sendCall();
	abstract void printLogo();
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성함.
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
