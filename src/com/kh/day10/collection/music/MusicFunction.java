package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {

	List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	public int mainMenu() {
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택 >>");
		int choice = sc.nextInt();
		return choice;
	}

	public void addLastLocationSong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("마지막 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String artist = sc.next();
		Music music = new Music(title, artist);
		mList.add(music);
		System.out.println("[서비스 성공]: 추가 성공!");
	}

	public void addFirstLocationSong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String artist = sc.next();
		Music music = new Music(title, artist);
		mList.add(0, music);
		System.out.println("[서비스 성공]: 추가 성공!");
		
	}

	public void allSongListOutput() {
		System.out.println("====== 전체 곡 목록 출력 ======");
		for(int i=0; i<mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i+1) + "번째 노래 ->" + "곡명 :" + music.getTitle() + " 가수명 : "+ music.getArtist());
			}
	}
	

	//곡명으로 음악검색
	public void searchSongByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 곡 입력 : ");
		String title = sc.nextLine();
		for(Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.println("검색 결과 >> 곡명 :" + music.getTitle() + " 가수명 : "+ music.getArtist());
				break;
			}
		}
		
	}

	//곡명으로 음악삭제
	public void removeSongByTitle() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("삭제할 곡 입력 :");
		String title = sc.nextLine();
		for(int i=0; i< mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				//mList에서 삭제
				mList.remove(i);
				break;
			}
		}
	}

	//곡명으로 음악 정보 수정하기
	public void modifySong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 곡 입력 : ");
		String title = sc.next();
		System.out.println("수정할 곡명 입력 : ");
		String modTitle = sc.next();
		System.out.println("수정할 가수명 입력 : ");
		String modArtist = sc.next();
		
		Music modMusic = new Music(modTitle, modArtist);
		for(int i=0; i<mList.size();i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				mList.set(i, modMusic);
			}
		}
	}

}
