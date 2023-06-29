package com.kh.day04.myexecption.exercise;

import java.util.*;

public class Exercise_Exception {
	
	public void exercise1()
	{
		Scanner sc = new Scanner(System.in);
		for(;;) {
			try {
				System.out.print("정수를 하나 입력하세요 : ");
				int num1 = sc.nextInt();
				System.out.print("정수를 하나 더 입력하세요 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.", num1, num2, result);			
				break;
				//e는 참조변수
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨어요? 정수를 입력해 주세요");
				sc.next(); //무한반복 안됨
			}
		}
	}
	
	public void practice2() {
		//3개의 정수를 입력 받아 합을 구하는 프로그램을 작성하여라
		//사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchexception 예외를 처리하여 다시 입력받오록 하여라
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수를 하나 입력하세요 :");
				int num1 = sc.nextInt();
				System.out.print("정수를 하나 더 입력하세요 :");
				int num2 = sc.nextInt();
				System.out.print("정수를 하나 더 입력하세요 : ");
				int num3 = sc.nextInt();
				int result = num1 + num2 + num3;
				System.out.printf("입력한 정수 세개의 합은 %d 입니다\n", result);			
			}
			catch(InputMismatchException e){
				System.out.println("문자를 입력하셨어요? 정수를 입력해 주세요");
				sc.next(); //무한반복 안됨
				
			}	
		}
		
		
	}
}

		
			
			

			
			

