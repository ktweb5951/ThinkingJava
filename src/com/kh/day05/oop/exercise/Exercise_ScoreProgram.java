package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	static int kor = 0;
	static int eng = 0;
	static int math = 0;	
	
	public static void main(String[] args)
	{
		
//		Scanner sc = new Scanner(System.in);
//		
//		int kor = 0;
//		int eng = 0;
//		int math = 0;	
//		int sum = 0;
//		double avg = 0.00;
//		
//		for(;;) {
//			
//			System.out.println("===== 메인 메뉴 =====");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 종료");
//			System.out.print("선택 : ");
//			int check = sc.nextInt();
//			if(check == 1) {
//				System.out.println("===== 성적 입력 =====");
//				System.out.print("국어 : ");
//				kor = sc.nextInt();
//				System.out.print("영어 : ");
//				eng = sc.nextInt();
//				System.out.print("수학 : ");
//				math = sc.nextInt();
//				sum = kor + eng + math;
//				avg = sum / 3;
//			} else if(check == 2) {
//				System.out.println("===== 성적 출력 =====");
//				System.out.printf("국어 : %d\n", kor);
//				System.out.printf("영어 : %d\n", eng);
//				System.out.printf("수학 : %d\n", math);
//				System.out.printf("총점 : %d\n", sum );
//				System.out.printf("평균 : %.2f\n", avg );
//			} else if(check == 3) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			} else {
//				System.out.println("항목에 없는 숫자를 입력하였습니다.");
//			}
//		
//		}
	
		//강사님 코드
		//구조적 프로그래밍 방식
		Scanner sc = new Scanner(System.in);

		finish :
		while(true) {
			pirntMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				inputScore();
				break;	
			case 2 : 
				printScore();
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
	public static void inputScore()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	public static void printScore()
	{
		System.out.println("===== 성적 출력 =====");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", kor+eng+math );
		System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3 );
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
