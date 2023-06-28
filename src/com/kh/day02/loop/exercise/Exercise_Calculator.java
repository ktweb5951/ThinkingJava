package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		char operatorInput = ' ';
		int resultNum = 0;
		
//		for(int i=0; i<3; i++) {
//			System.out.print("정수 하나 입력 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수 하나 더 입력 : ");
//			num2 = sc.nextInt();
//			System.out.print("연산자 입력(+,-,*,/,%) : ");
//			operatorInput = sc.next().charAt(0);
//			
//			switch(operatorInput) {
//			case '+' :
//				resultNum = num1 + num2;
//				break;
//			case '-' :
//				resultNum = num1 - num2;
//				break;
//			case '*' :
//				resultNum = num1 * num2;
//				break;
//			case '/' :
//				resultNum = num1 / num2;
//				break;
//			case '%' :
//				resultNum = num1 % num2;
//			}
//			System.out.println(num1 + " " +operatorInput + " "+num2 + " = " + resultNum);	
//		}
//		
	
		// 방법2 
		int count = 0;
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			operatorInput = sc.next().charAt(0);
			
			switch(operatorInput) {
			case '+' :
				resultNum = num1 + num2;
				break;
			case '-' :
				resultNum = num1 - num2;
				break;
			case '*' :
				resultNum = num1 * num2;
				break;
			case '/' :
				resultNum = num1 / num2;
				break;
			case '%' :
				resultNum = num1 % num2;
			}
			System.out.println(num1 + " " +operatorInput + " "+num2 + " = " + resultNum);	
			count++;
			if(count == 3 ) break;
		}
	
	}

}
