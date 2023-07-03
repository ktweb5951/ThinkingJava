package com.kh.day06.oop.student;

import java.util.Scanner;


public class StudentRun {
	static int index = 0;
	public static void main(String[] args) {
		//학생 성적 확인 프로그램
		// 1. 학생 성적 입력
		// 2. 학생 성적 출력
		// 3. 재평가 여부 확인
		// 4. 프로그램 종료
		// 메뉴 입력 : 4
//		Student [] stds = new Student[2];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			printMenu();
//			int choice = sc.nextInt();
//			switch(choice) {
//			case 1 :
//				inputScore(stds);
//				break;
//			case 2 :
//				printScore(stds);
//				break;
//			case 3 : 
//				checkPass(stds);
//				break;
//			case 4 :
//				printExit();
//				break;
//			default : printException();
//			}
//		}
//		
//			
//	}
//	public static void printMenu() {
//		System.out.println("== 학생 성적 확인 프로그램 == ");
//		System.out.println("1. 학생 성적 입력");
//		System.out.println("2. 학생 성적 출력");
//		System.out.println("3. 재평가 여부 확인");
//		System.out.println("4. 프로그램 종료");	
//		System.out.print("선택 >> ");	
//	}
//	
//	public static void inputScore(Student [] stds) {
//		Scanner sc = new Scanner(System.in);
//		//for(int i=0; i<stds.length;i++) {
//			stds[index] = new Student();
//			System.out.println("== 학생 정보 입력 ==");
//			System.out.print("이름 >> ");
//			stds[index].name = sc.next();
//			System.out.print("1차 점수 >> ");
//			stds[index].score1 = sc.nextInt();
//			System.out.print("2차 점수 >> ");
//			stds[index].score2 = sc.nextInt();	
//			
//			if(index<=stds.length) index++; 
//		//}
//		
//	}
//	public static void printScore(Student [] stds) {
//		for(int i=0;i<index;i++) {
//			System.out.println("=====성적 출력=====");
//			System.out.printf("이름 : %s\n", stds[i].name);
//			System.out.printf("1차 점수 : %d\n", stds[i].score1);
//			System.out.printf("2차 점수 : %d\n", stds[i].score2);
//			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
//		}
//	}
//	
//	public static void checkPass(Student [] stds) {
//		
//		for(int i=0;i<index;i++) {
//			System.out.println("== " + (i+1)  + "번째 "+ stds[i].name + "학생의 성적 확인 결과 ==" );
//			if(stds[i].score1 >= 60 && stds[i].score2 >=60) {
//				System.out.println("통과하였습니다.");
//			} else if (stds[i].score1 >=60 && stds[i].score2<60) {
//				System.out.println("2차 시험 재평가 대상입니다");
//			} else if (stds[i].score1 < 60 && stds[i].score2>=60) {
//				System.out.println("1차 시험 재평가 대상입니다");
//			} else if (stds[i].score1 < 60 && stds[i].score2 < 60) {
//				System.out.println("1차,2차 시험 재평가 대상입니다");
//			}
//			else if (stds[i].score1 < 40 && stds[i].score2 < 40) {
//				System.out.println("과락입니다.");
//			}
//		}
		
//		double avg = stds[0].getAvg();
//		int num1 = stds[0].score1;
//		int num2 = stds[0].score2;
//		
//		for(int i=0; i<index;i++) {
//			if(avg >= 60) {
//				if(num1<40) {
//					System.out.println("1차 시험 재평가 대상입니다.");
//				} else if(num2<40) {
//					System.out.println("2차 시험 재평가 대상입니다.");
//				}
//				System.out.println("통과했습니다.");
//			} else {
//				if(num1 < 60) {
//					System.out.println("1차 시험 재평가 대상입니다.");
//				}
//				if(num2 < 60) {
//					System.out.println("2차 시험 재평가 대상입니다.");
//				}
//			}
//			
//		}
//	}
	
//	public static void printExit() {
//		System.out.println("프로그램을 종료합니다.");
//	}
//	public static void printException() {
//		System.out.println("잘못 입력 하셨습니다.");
//	}
		
		
		Student [] stdArr = new Student[2];
		finish :
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				inputScore(stdArr);
				break;
			case 2 :
				printScore(stdArr);
				break;
			case 3 : 
				checkPass(stdArr);
				break;
			case 4 : 
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			}
		}		
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("학생 성적 확인 프로그램");
		System.out.println();
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice= sc.nextInt();
		System.out.println(1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
		return choice;
	}
	public static void inputScore(Student [] stdArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println((i+1)+"번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차점수 입력 : ");
			int secondScore = sc.nextInt();
			stdArr[i] = new Student();
			stdArr[i].setName(name);
			stdArr[i].setFirstScore(firstScore);
			stdArr[i].setSecondScore(secondScore);
		}
	}
	public static void printScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println((i+1)+"번째 학생 정보 출력");
			System.out.println(stdArr[i].getName() +" 학생의 점수는 1차 점수 : " 
					+ stdArr[i].getFirstScore() + "점, 2차 점수 : " 
					+ stdArr[i].getSecondScore() + "점입니다.");
		}
	}
	
	public static void checkPass(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {
			double avg = stdArr[i].getAvg();
			int num1 = stdArr[i].getFirstScore();
			int num2 = stdArr[i].getSecondScore();
			System.out.println((i+1)+"번째, " + stdArr[i].getName() + "학생 확인 결과");
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재평가 ㅇㅇ..");
				}else if(num2 < 40) {
					System.out.println("2차 시험 재평가 ㅇㅇ..");
				}else {
					System.out.println("통과!! ㅊㅊ");
				}
			}else {
				if(num1 < 60) {
					System.out.println("1차 시험 재평가 ㅇㅇ..");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재평가 ㅇㅇ..");
				}
//			System.out.println("모두 재평가..ㅋ");
			}
		}
	}
}
