package com.kh.day02.loop.exercise;

public class Exercise_while2 {
	public static void main(String [] args)
	{
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
