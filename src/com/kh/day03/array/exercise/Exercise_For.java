package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1()
	{
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		
//		int sum = 0;
//		int count = 0;
//		for(int i=1;i<=10;i++) {
//			count++;
//			if(count<10) {
//				System.out.print( i + "+");	
//			} else
//				System.out.print(i);	
//			sum += i;
//		}
//		System.out.print("=" + sum);
		
		
		//강사님 코드
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			
			if(i<=9) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.println(sum);
		
	}
	
	public void forExercise2()
	{
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan>=1 && dan<=9) {
			System.out.println("[구구단 " + dan + "단]"
					+ "");
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}			
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
		}

	}
	
	public void forDoubleExercise1()
	{
		//2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오
		for(int k=1; k<10; k++) {
			for(int h=2; h<10; h++) {
				System.out.print(h + " * " + k + " = " + h*k + "	");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise2()
	{
		//0시0분부터 23시59분까지 출력하기
		for(int i=0; i<24; i++) {
			for(int j=0; j<60; j++) {
				//System.out.println(i + "시" +  " " + j + "분");
				System.out.printf("%2d시 %2d분\n", i, j);
			}
		}
	}
	
	public void forDoubleExercise3()
	{
		//별직기
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	// 반복문_실습문제_01	
	
	//1번
	public void loopExercise01()
	{
	    //1번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num>=1) {
				System.out.print(i + " ");
			}
		}
		if(num<1) {
			System.out.print("1 이상의 숫자를 입력해 주세요.");
		}
		
	}
	
	
	// 반복문_실습문제_02
    // 1번
    // 1부터 사용자에게 입력 받은 수까지 중에서
    // 1) 2와 3의 배수를 모두 출력하고
    // 2) 2와 3의 공배수의 개수를 출력하세요.
	
	public void loopExercise02_1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i +  " ");
			}
			if(i%2==0 && i%3==0) {
				count++;
			}
		}
		System.out.print("\n2와 3의 공배수의 갯수 : " + count);
	}
	
    // 2번
    /*
     다음과 같은 실행 예제를 구현하세요.
     
      ex. 정수 입력 : 3
	     *
	     **
	     ***
	     **
	     *
     */
	public void loopExercise02_2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=num;i++) {
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
    // 3번
    /*
     * 다음과 같은 실행 예제를 구현하세요.
     *
     * ex. 정수 입력 : 4
     *
     ***
     *****
     *******
     */
	public void loopExercise02_3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
    // 4번
    /*
     * 다음과 같은 실행 예제를 구현하세요.
     *
     * ex. 정수 입력 : 5
     *****
     *   *
     *   *
     *   *
     *****
     */
	
	public void loopExercise02_4()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if(i==1 || i==num) {
					System.out.print("*");
				} else if(j==1 || j==num) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
    // 5번
    // 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
    // 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

	public void loopExercise02_5()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		double input = sc.nextDouble();
		
		if(input>2) {
			if(input%1 != 0 ) {
			System.out.print("소수입니다.");
			} else {
				System.out.print("정수입니다.");	
			}
		} else {
			System.out.print("잘못 입력하셨습니다");
		}
	}
	
    // 6번
    // 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
    // “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.

	public void loopExercise02_6()
	{
		Scanner sc = new Scanner(System.in);
		
		
		for(;;) {
			System.out.print("숫자를 하나 입력하세요 : ");
			double input = sc.nextDouble();
			if(input>2) {
				if(input%1 != 0 ) {
					System.out.print("소수입니다.");
					break;
				} else {
					System.out.print("정수입니다.");
					break;
				}
			} else {
				System.out.print("잘못 입력하셨습니다 \n");
			}			
		}
			

	}
	
    // 7번
    // 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
    // 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	public void loopExercise02_7()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		double input = sc.nextDouble();
		
		if(input>2) {
			
		} else {
			Sysetem.out.print("잘못 입력하셨습니다.");
		}

	}
	
}
