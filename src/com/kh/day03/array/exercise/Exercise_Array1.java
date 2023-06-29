package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1()
	{
		//양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 추력하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		int max = 0;
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("양수를 입력하세요 : ");
			nums[i] = sc.nextInt();
			
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.print("입력한 값 중 가장 큰 수는 " + max + "입니다.");		
	}
	
	public void exercise2()
	{
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		int arrs[] = new int[5];
		
		int sum = 0;
		for(int i=0; i<arrs.length; i++) {
			System.out.print("정수를 입력하세요 :");
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.print("입력된 값의 평균은 " + (double)sum /arrs.length + "입니다");
		
	}
	
	public void arrayCopyExercise()
	{
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 부터 *로 저장되어 출려되도록 프로그램을 작성하시오.
		// 230515-1231514 -> 230515-1******
		
		char[] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해 주세요 : ");
		String memberNum = sc.next();
		
		for(int i=0; i<origin.length;i++) {
			origin[i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사의 시작
		for(int i = 0; i < origin.length; i++) {
			if(i<8) {
				copy[i] = origin[i]; //성별자리 전까지 차례대로 값을 대입		
			} else {
				copy[i] = '*'; // 성별 자리 이후엔 *로 값 대입			
			}	
		}
		for (int i=0; i< copy.length;i++) {
			System.out.print(copy[i]);
		}
	}
	
	//끝판왕 //로또
	public void lottoExercise()
	{
		// 로또 번호 자동 생성기 프로그램, 중복없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개, 로또 번호의 범위는 1~45
		Random rand = new  Random();
		int[] lottoArrs = new int[6];
		int lottoNum =0;
		
		for(int i=0; i<lottoArrs.length; i++) {
			lottoNum = rand.nextInt(45)+1;
			lottoArrs[i] = lottoNum;
	
		}
		
		int [] copy = new int[6];
		for(int i=0; i<lottoArrs.length; i++) {
			copy[i] = lottoArrs[i];
		}
		

		for(int i=0;i<copy.length-1;i++) {
			for(int j=0;j<(copy.length-1)-i;j++)
				if(copy[j]>copy[j+1]) {
					int temp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = temp;
				}			
		}
		System.out.println("== 로또번호 ==");
		for (int i=0; i<copy.length;i++) {
			System.out.print(copy[i]+ " ");
		}
		
	}

	//배열 실습문제
	
	//1번 
	public void practice1()
	{
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arrs = new int[10];
		for (int i = 0; i < 10; i++) {
			arrs[i] = i + 1;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

	//2번
	public void practice2()
	{
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arrs = new int[10];
		for (int i = 0; i < 10; i++) {
			arrs[i] = i+1;
		}
		
		for(int i = 10 ; i>0 ; i-- ) {
			System.out.print(arrs[i-1] + " ");
		}
	}
	//3번
	public void practice3()
	{
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int [] arrs = new int[num];
	
		for(int i=0; i<num; i++) {
			arrs[i] = i+1;
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	//4번
	public void practice4()
	{
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
		String [] fruits = new String[5];
		fruits = new String[]{"사과", "귤", "포도", "복숭아", "참외"};
		
		for(int i=0; i<5; i++) {
			if(fruits[i]=="귤") {
				System.out.print(fruits[i]);
			}
		}
	}
	
	
	//5번
	public void practice5()
	{
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str= sc.next();
		int count = 0;
		char [] arrs = new char[str.length()];
		
		for(int i=0; i<arrs.length; i++) {
			arrs[i] = str.charAt(i);
		}
		
		System.out.print("문자 : " );
		char inputChar = sc.next().charAt(0); 
		System.out.print(str + "에 " + inputChar + "가 존재하는 위치(인덱스) : "  );
		
		for(int i=0; i<arrs.length; i++) {
			if(arrs[i] == inputChar) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.print("\n" + inputChar + " 개수 : " + count);
		
	}
	
	
	//6번
	public void practice6()
	{
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String [] dayWeek = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		String day = " ";
		
		if(input>=0 && input<=6) {
			for(int i=0; i<dayWeek.length; i++) {
				if(i==input) {
					System.out.print(dayWeek[i]);
				} 
			}			
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}
		
	}
	
	//7번
	public void practice7()
	{
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int [] arrs = new int[num];
		int input = 0;
		int sum = 0;
		for(int i=0; i<arrs.length; i++) {
			System.out.print("배열" + i + "번째에 인덱스에 넣을 값 : ");
			input = sc.nextInt();
			arrs[i] = input;
			sum += input;
		}
		
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.print("\n총합 : " + sum);
		
	}
}
