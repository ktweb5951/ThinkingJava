package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}
	
// 자바 doc 주석 // 매개변수가 무엇인지 리턴형이 무엇인지 적을 수 있음 
	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);		
	}
	
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 * 곡 삭제하기
	 * @param i
	 */
	
	public void removeMusic(int i) {
		//mList에서 삭제	
		mList.remove(i);
	}

	/**
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	
	public List<Music> printMusicList(){
		return mList;
	}

	
	/**
	 * 음악 이름으로 검색
	 * @param title
	 * @return findList
	 */
	
	public List<Music> searchMusicsByName(String title) {
		//찾은 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mlist에서 찾기
		for(Music mOne : mList) {
			//입력한 이름이 같으면
			if(mOne.getTitle().equals(title)) {
				//findList에 추가
				findList.add(mOne);
			}
		}
		// 다 찾았으면 리턴하기
		return findList;
	}
	
	/**
	 * 이름으로 곡 검색하기
	 * @param title
	 * @return
	 */
	
	public int searchOneByTitle(String title) {
		for(int i=0; i< mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

//삽입정렬
	public void insertionSortBytitleASC() {
		// 5, 7, 2, 1, 4
		
		for(int i=1; i<mList.size()-1; i++) {
			for(int j=i; j>0; j--) {
				Music mOne = mList.get(j-1);
				Music mTwo = mList.get(j);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j-1, mTwo);
					mList.set(j, temp);
				}
			}
		}
	}

	
//선택정렬
	public void selectionSortBytitleASC() {
		int min;
		for(int i=0;i<mList.size()-1;i++) {
			min = i;
			Music mMin = mList.get(min);
			Music mOne = mList.get(i);
			for(int j=i+1; j<mList.size(); j++) {
				Music mTwo = mList.get(j);
				if(mMin.getTitle().compareTo(mTwo.getTitle()) > 0) {
					min = j;
					mMin = mList.get(min);
				}
			}
			Music temp = mMin;
			mList.set(min, mOne);
			mList.set(i, temp);
		}
	}
	
	public void bubbleSortByTitleASC() {
		// TODO Auto-generated method stub
//		int [] nums; -> mList로 변경필요
		for(int i=0; i< mList.size()-1; i++) {
			for(int j=0; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 스트링하고 비교하는데에 <, > 꺽쇠 사용금지
				// 결과값이 
				// 0 이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortByTitleDESC() {
		for(int i=0; i<mList.size()-1; i++) {
			for(int j=0; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
		
	}

	public void bubbleSortBySingerASC() {

		for(int i=0; i< mList.size()-1; i++) {
			for(int j=0; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
		
	}

	public void bubbleSortBySingerDESC() {

		for(int i=0; i< mList.size()-1; i++) {
			for(int j=0; j<(mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
		
	}	






	
}
	
	

