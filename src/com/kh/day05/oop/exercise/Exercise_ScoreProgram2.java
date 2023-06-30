package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();

	
	public static void main(String[] args)
	{
		
		//구조적 프로그래밍 방식
		Scanner sc = new Scanner(System.in);

		finish :
		while(true) {
			pirntMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				Student.inputScore();
				break;	
			case 2 : 
				Student.printScore();
				break;
			case 3 : 
				showGoodBye();
				break finish; //와일문안에 스위치문사용시에 와일문 종료하고싶을때 사용
			default : printException();
			}
		}
		
	}

	public static void pirntMenu()
	{
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}


	public static void showGoodBye()
	{
		System.out.println("프로그램이 종료되었습니다.");
	}
	public static void printException()
	{
		System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
