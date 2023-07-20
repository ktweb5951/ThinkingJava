package com.kh.day18.music.controller;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

public class MusicController {

	MusicDAO musicDao;
	
	public MusicController() {
		musicDao = new MusicDAO();
	}
	
	/**
	 * 곡 정보 등록
	 * @param music 입력 받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		musicDao.addMusic(music);
	}

	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> allMusicInfo() {
		List<Music> mList = musicDao.allmusicInfo();
		return mList;
	}

	/**
	 * 가수명으로 곡 검색
	 * @param singer
	 * @return
	 */
	public List<Music> findListeBySinger(String singer) {
		List<Music> mList  = musicDao.findListBySinger(singer);
		return mList;
//		return musicDao.findListBySinger(singer);
	}

	public int findIndexBySinger(String singer) {
		int index = musicDao.findIndexBySinger(singer);
		return index;
	}

	public void deletMusic(int index) {
		musicDao.removeMusic(index);
	}


	public void modifyMusic(int index, Music music) {
		musicDao.updateMusic(index, music);
	}

	public Music findMusicBySinger(String singer) {
		Music music = musicDao.findMusicBySinger(singer);
		return music; // 리턴은 널로 두지 않는다.
	}

}
