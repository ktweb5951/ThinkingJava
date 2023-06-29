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

		int sum=0;
		System.out.println("정수 3개를 입력하세요.");
		for(int i=0; i<3; i++) {
			System.out.print(i + ">>");
			try 
			{
				sum += sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("문자를 입력하셨어요? 정수를 입력해 주세요");
				sc.next(); //입력한 문자를 제거한다.
				i--; //2에서 다시 1로 i값을 만들엊무, i++만나서 증가하도록 하기 위함
				continue; // i++로 가게 해줌
			}
		}
		System.out.printf("정수 3개의 합은 %d 입니다", sum);

		
	}
	
	public void exercise3() {
		// 범위를 벗어난 배열의 접근
		int [] intArrs = new int[5];		
		try
		{
			System.out.println(intArrs[5]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		
	}
	
	public void exercise4()
	{
		//정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		//(NumberFormatException)
		String [] str = new String[2];
		str[0] = "1026";
		str[1] = "5.15";
		try {	
			int result = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d\n", result);
			int check = Integer.parseInt(str[1]);
			System.out.printf("숫자로 변환된 값은 %d\n", check);
		}catch(NumberFormatException e) {
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
		
		
	}
}

		
			
			

			
			

