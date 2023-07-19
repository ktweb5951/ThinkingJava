package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController {
	MemberDAO memberDao;
//	private List<Member> mList;
//	private MemberView view;
	
	public MemberController() {
//		view = new MemberView();
//		mList = new ArrayList<Member>();
		memberDao = new MemberDAO();
	}
	
	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name String으로 입력 받은 값
	 * @return in값 없으면 -1 리턴
	 */
	public int findIndexByName(String name) {
		int index = memberDao.findIndexByName(name);
		return index;
	}
	/**
	 * 이름으로 회원정보 찾기
	 * @param name String으로 입력 받은값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		return memberDao.findOneByName(name);
	}
	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {
		return memberDao.allMemberList();
	}
	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		memberDao.addMember(member);
	}
	/**
	 * 회원 정보 수정
	 * @param index
	 * @param mOne
	 */
	public void modifyMember(int index,Member mOne) {
		memberDao.modifyMember(index, mOne);
	}

	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		memberDao.subMember(index);
	}
	
}
