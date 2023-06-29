package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_while {
	public void whileExercise1()
	{
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
//		입력한 수의 합을 출력하시오.
//		정수하나 입력 : 3
//		정수하나 입력 : 4
//		정수하나 입력 : 7
//		정수하나 입력 : -1
//		입력하신 수의 합은 14입니다.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int input = sc.nextInt();
			if(input != -1) {
				sum+=input;
			} else {
				break;
			}
		}	
		
		
		//두번째 방법
//		int input =0;
//		while(input != -1) {
//			System.out.print("정수 하나 입력 : ");
//			input = sc.nextInt();
//			sum += input;
//		}
//		System.out.print("입력하신 순의 합은 : " + (sum+1) + "입니다");

	}
	
	public void whileExercise2() {
//		while문을 이용하여 1~100사이의 홀수의 합을 구하시오		
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%2!=0) {
				sum += i;
			}
			i++;
		}
		System.out.print("1~100까지의 홀수의 합은 " + sum + "입니다");

	}
}
