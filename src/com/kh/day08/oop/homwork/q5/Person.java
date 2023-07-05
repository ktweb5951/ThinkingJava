package com.kh.day08.oop.homwork.q5;

public class Person {
	String name;
	int money;
	
	public Person() {}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(Caffe caffe, int money) {
		//돈 - 커피값 
		//this.money = this.money - money;
		this.money -= money;
		caffe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");		
	}
	
	
}
