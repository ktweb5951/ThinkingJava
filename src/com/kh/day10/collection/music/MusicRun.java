package com.kh.day10.collection.music;

public class MusicRun {

	public static void main(String[] args) {
		
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int choice = mFunc.mainMenu();
			switch(choice){
			
			case 1: mFunc.addLastLocationSong();  break;
			case 2: mFunc.addFirstLocationSong(); break;
			case 3: mFunc.allSongListOutput(); break;
			case 4: mFunc.searchSongByTitle(); break;
			case 5: mFunc.removeSongByTitle(); break;
			case 6: mFunc.modifySong(); break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			case 0: System.out.println("프로그램이 종료되었습니다");break end;
			}
		}
	}

}
