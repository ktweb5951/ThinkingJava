package com.kh.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// a와 b를 합하여 리턴
		int result = a + b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		// a와 b를 빼서 리턴
		return a-b;
	}

	@Override
	public double average(int[] a) {
		//배열을 입력받아 평균을 구한 뒤 그 값을 리턴
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double)a.length;
		return avg;
	}

}
