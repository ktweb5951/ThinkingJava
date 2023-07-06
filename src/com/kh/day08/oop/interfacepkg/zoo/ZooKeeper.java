package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper {
	//하나의 메소드로 대응가능
	public void feed(FoodInterface predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	//이름이 같고 갯수같으나 타입이 다름 = 오버로딩
//	public void feed(Bear bear) {
//		System.out.println("feed " + bear.animalFood());
//	}
//	public void feed(Tiger tiger) {
//		System.out.println("feed " + tiger.animalFood());
//	}
//	public void feed(Lion lion) {
//		System.out.println("feed " + lion.animalFood());
//	}
	
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Bear());
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
}
