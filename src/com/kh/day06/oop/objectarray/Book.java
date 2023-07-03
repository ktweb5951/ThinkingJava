package com.kh.day06.oop.objectarray;

public class Book {
	String title, author;
	
	public Book() {
		
	}
	//기본 생성자를 안쓰고 매개변수 생성자를 쓸 수 있지만 기본생성자 호출을 사용할 수는 없다.
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
