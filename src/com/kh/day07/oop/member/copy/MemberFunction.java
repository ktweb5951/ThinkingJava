package com.kh.day07.oop.member.copy;

import java.util.Scanner;

public class MemberFunction {
	private Member [] memArrs;
	private int index;
	
	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}
	
	public int printMenu()
	{
		// 회원 관리 프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램 종료
		// 메뉴 입력 :
		Scanner sc = new Scanner(System.in);
		System.out.println("회원관리프로그램");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo()
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원정보입력 =====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); // 개행제거
		String address = sc.nextLine();
		//원인 : nextLine은 공백을 입력받기 때문에 이메일을 치고 엔터를 누른 엔터가 입력됨 , 해결방안 : 위에 sc.nextLine();을 입력한다.
//		memArrs[0] = new Member();
		memArrs[index] = new Member(memberId, memberPw, email, address);
		if(index<memArrs.length) index++;
 	}
	
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("===== 회원정보출력 =====");
		for (int i=0; i<index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n", memArrs[i].getMemberId(), memArrs[i].getMemberPw(), memArrs[i].getMemberEmail(), memArrs[i].getMemberAddress());
			//index의 길이
		}
	}
	
	
	
	
	
}
